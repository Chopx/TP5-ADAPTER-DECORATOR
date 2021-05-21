
public class Main {
	public static void main(String[] args) {
		RestCall rest = new RestCall("https://jsonplaceholder.typicode.com/posts");
		System.out.println(rest.run());

		// Combinacion de BD y Texto
		ListaEnBD guardarListaEnBDyTexto = new ListaEnBD("jdbc:mysql://localhost:3306/tp5_ej4",
				new ListaEnTexto("C:\\Users\\ELJUEEN\\Desktop\\ListaBDyText.txt", rest));
		guardarListaEnBDyTexto.run();

		// Solo en BD
		ListaEnBD guardarEnBD = new ListaEnBD("jdbc:mysql://localhost:3306/tp5_ej4", rest);

		// Solo en Texto
		ListaEnBD guardarEnTexto = new ListaEnBD("C:\\Users\\ELJUEEN\\Desktop\\ListaTexto.txt", rest);

	}
}