package es.iessoterohernandez.daw.endes.pruebaJUnit;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestMovimiento extends CoreMatchers {
	 private static Movimiento mov;
	 
	@BeforeAll
	static void init() {
		mov = new Movimiento();
	}

	@AfterAll
	static void finish() {
		mov = null;
	}

	@Test
	void testGetImporte() {
		mov.setImporte(1000000.0);
		assertThat("ERROR: El método getImporte() no funciona.", mov.getImporte(), is(1000000.0));
	}

	@Test
	void testGetConcepto() {
		mov.setConcepto("Javi, apruébame");
		assertThat("ERROR: El método getConcepto() no funciona.", mov.getConcepto(), is("Javi, apruébame"));
	}

	@Test
	void testSetConcepto() {
		mov.setConcepto("Hola");
		assertThat("ERROR: El método getConcepto() no funciona.", mov.getConcepto(), is("Hola"));
	}

	@Test
	void testSetImporte() {
		mov.setImporte(100.0);
		assertThat("ERROR: El método getImporte() no funciona.", mov.getImporte(), is(100.0));
	}

}
