import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;

import org.junit.Test;

public class Testeo {

	@Test
	public void testExportarSobreescribir() {
		ReporteSobrescribir report = new ReporteSobrescribir("Reporte xd");
		File file = new File("C:\\Users\\ELJUEEN\\Desktop\\reporte.txt");

		assertDoesNotThrow(() -> {
			report.export(file);
		});

	}

	@Test
	public void testExportarSinSobreescribir() {
		
		File file = new File("C:\\Users\\ELJUEEN\\Desktop\\reportex.txt");

		if (file.exists())
			file.delete();

		assertDoesNotThrow(() -> {
			new ReporteSinSobreescribir(new ReporteSobrescribir("Reporta lpm")).export(file);
		});

	}

}
