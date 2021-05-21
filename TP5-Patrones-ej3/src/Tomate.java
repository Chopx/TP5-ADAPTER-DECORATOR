
public class Tomate extends AdicionalesDecorator {

	Combo combo;

	public Tomate(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String getDescripcion() {
		return combo.getDescripcion() + " , Tomate";
	}

	@Override
	public int valor() {
		return 100 + combo.valor();
	}
}