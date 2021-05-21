
public class Carne extends AdicionalesDecorator {

	Combo combo;

	public Carne(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String getDescripcion() {
		return combo.getDescripcion() + " , Medallón de Carne";
	}

	@Override
	public int valor() {
		return 500 + combo.valor();
	}
}
