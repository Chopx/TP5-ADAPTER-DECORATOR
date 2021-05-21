import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class ListaEnBD extends Lista {

	private Connection dbConn;
	private String url;
	private Lista lista;

	public ListaEnBD(String urldb, Lista lista) {
		this.url = urldb;
		this.lista = lista;
	}

	@Override
	public String run() {
		conectarConBaseDeDatos();
		String salida = lista.run();
		
		try {
			PreparedStatement st = dbConn.prepareStatement("insert into lista(info) values (?)");

			st.setString(1, salida);
			st.executeUpdate();
			st.close();
			return salida;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException("Error en cargar lista");
		}

	}

	private void conectarConBaseDeDatos() {
		String user = "root";
		String password = "";
		try {
			this.dbConn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
