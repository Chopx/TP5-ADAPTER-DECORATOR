
public class Papas extends AdicionalesDecorator {

	Combo combo;

	public Papas(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String getDescripcion() {
		return combo.getDescripcion() + " , Papas";
	}

	@Override
	public int valor() {
		return 200 + combo.valor();
	}
}

