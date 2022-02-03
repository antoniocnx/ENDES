package es.iessoterohernandez.daw.endes.pruebaJUnit;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCuenta extends CoreMatchers {
	
	private static Cuenta cu;
	
	@BeforeAll
	static void init() {
		cu = new Cuenta("20", "Vini Jr");
	}

	@AfterAll
	static void finish() {
		cu = null;
	}

	@Test
	void testIngresar() throws IngresoNegativoException {
		cu.ingresar("Hola", 20.0);
		assertThat("ERROR: El método ingresar() no funciona.", cu.getSaldo(), is(20.0));
	}

	@Test
	void testRetirar() throws IngresoNegativoException, SaldoInsuficienteException {
		cu.ingresar("Hola", 10.0);
		cu.retirar("Adiós", 10.0);
		assertThat("ERROR: El método ingresar() no funciona.", cu.getSaldo(), is(0.0));
	}

}
