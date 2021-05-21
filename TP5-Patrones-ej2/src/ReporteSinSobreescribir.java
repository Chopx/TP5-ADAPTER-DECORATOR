import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//AGREGA SOBRE EL BASE u ORIGINAL

public class ReporteSinSobreescribir extends Reporte {

	private Reporte reporte;

	public ReporteSinSobreescribir(Reporte reporte) {
		this.reporte = reporte;
	}

	@Override
	void export(File file) {

		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}

		if (file.exists()) {
			throw new IllegalArgumentException("El archivo ya existe...");
		}

		reporte.export(file);

	}

}
