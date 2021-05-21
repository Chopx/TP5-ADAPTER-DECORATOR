//ADAPTABLE

public class MotorElectrico {

	boolean conectado = false;
	boolean activo = false;
	
	public void conectar() {
		if(conectado)
		System.out.println("Motor está conectado, no puede volver a conectarse");
		else {
			conectado = true;
			System.out.println("Motor conectado");
		}
	}

	public void activar() {
		if (conectado && activo)
		System.out.println("El motor ya está conectado y activo!");
		else {
			if (conectado && !activo) {
				activo = true;
				System.out.println("El motor se activo");
			}
			else {
				System.out.println("El motor debe estar conectado primero");
			}
		}
	}

	public void moverMasRapido() {
		if(conectado && activo)
		System.out.println("Aumentando velocidad");
		else 
			System.out.println("Para aumentar la velocidad el motor debe estar conectado y activo");
	}

	public void detener() {
		if(activo)
		System.out.println("Motor detenido");
		else {
			System.out.println("El motor debe estar activo");
		}
	}

	public void desconectar() {
		if(conectado) {
			conectado = false;
			System.out.println("Motor desconectado");
		} 
		else
			System.out.println("El Motor ya está desconectado");
	}

}
