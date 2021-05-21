import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Testeo {

	@Test
	public void testRealizarPedidoComboBasicoConAdicionales() {
		
		Combo comboConCarneYPapas = new Papas(new Carne(new ComboBasico()));
		
		System.out.println("Combo Basico c/ carne y papas: " + comboConCarneYPapas.getDescripcion());
		
		assertEquals(comboConCarneYPapas.valor(), 1500);
	}
	
	@Test
	public void testRealizarPedidoComboFamiliarConAdicionales() {
		
		Combo comboConQuesoYTomate = new Tomate(new Queso(new ComboFamiliar()));
		
		System.out.println("Combo Familiar c/ queso y tomate: " + comboConQuesoYTomate.getDescripcion());
		
		assertEquals(comboConQuesoYTomate.valor(), 1800);
	}
	
	@Test
	public void testRealizarPedidoComboEspecialConAdicionales() {
		
		Combo comboEspecialConTodo = new Papas(new Carne(new Tomate(new Queso(new ComboEspecial()))));
		
		System.out.println("Combo con todo: " + comboEspecialConTodo.getDescripcion());
		
		assertEquals(comboEspecialConTodo.valor(), 2200);
	}
}
