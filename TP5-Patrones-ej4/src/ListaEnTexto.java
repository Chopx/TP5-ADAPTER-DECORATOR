import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ListaEnTexto extends Lista {

	private String ruta;
	private Lista lista;

	public ListaEnTexto(String ruta, Lista lista) {
		this.ruta = ruta;
		this.lista = lista;
	}

	@Override
	public String run() {
		File file = new File(ruta);
		String salida = lista.run();
		try {
			FileWriter x = new FileWriter(file);
			x.write(salida);
			x.close();
			return salida;

		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

}
