package Com.miempresa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	@Test

	public void testSumarConNegativos() {

	    calculadora calc = new calculadora();

	    assertEquals(-1, calc.sumar(2, -3)); // 2 + (-3) = -1
	}

}
