
public class Queso extends AdicionalesDecorator {

	Combo combo;

	public Queso(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String getDescripcion() {
		return combo.getDescripcion() + " , Queso";
	}

	@Override
	public int valor() {
		return 200 + combo.valor();
	}
}
