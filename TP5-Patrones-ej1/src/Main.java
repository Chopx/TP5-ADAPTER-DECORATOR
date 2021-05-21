
public class Main {

	public static void main(String[] args) {
	
		Motor motorE = new MotorElectricoAdapter();
		motorE.arrancar();
		motorE.acelerar();
		motorE.apagar();
	
		Motor motorD = new MotorDiesel();
		motorD.arrancar();
	}
	
}
