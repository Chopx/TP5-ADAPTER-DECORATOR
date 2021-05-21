
//ADAPTADOR

public class MotorElectricoAdapter extends Motor {

	MotorElectrico motorElectrico = new MotorElectrico();
	
	@Override
	public void arrancar() {
		motorElectrico.conectar();
		motorElectrico.activar();
	}

	@Override
	public void acelerar() {
		motorElectrico.moverMasRapido();	
		
	}

	@Override
	public void apagar() {
		motorElectrico.detener();
		motorElectrico.desconectar();
	}

}
