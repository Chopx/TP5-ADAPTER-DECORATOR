import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

//BASE u ORIGINAL

public class ReporteSobrescribir extends Reporte {

	private String reporte;

	public ReporteSobrescribir(String reporte) {
		this.reporte = reporte;
	}

	@Override
	void export(File file) {
		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}

		try {
			FileWriter x = new FileWriter(file);
			x.write(reporte);
			x.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
