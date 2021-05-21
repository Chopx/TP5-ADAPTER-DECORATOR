
public class MotorDiesel extends Motor {

	boolean encendido = false;

	public void arrancar() {
		if (!encendido)
			System.out.println("Ruido de motor");
		else
			System.out.println("El motor debe estar encendido");
	}

	public void acelerar() {
		if (encendido)
			System.out.println("Ruido de aceleración");
		else
			System.out.println("El motor debe estar encendido");
	}

	public void apagar() {
		if (encendido)
			System.out.println("Ruido de motor deteniendose");
		else
			System.out.println("El motor debe estar encendido");
	}

}
