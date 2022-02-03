package es.iessoterohernandez.daw.endes.pruebaJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized.Parameters;

class TestEmpleado {
	
	private static Empleado em;
	
	@BeforeAll
	static void init() {
		em = new Empleado();
	}

	@AfterAll
	static void finish() {
		em = null;
	}
	
	@Parameters
	static Stream<Arguments> empleados() {
		return Stream.of(
				Arguments.of("Karim", "Benzema", 34, 12),
				Arguments.of("Luka", "Modric", 36, 10));
	}
	
	@ParameterizedTest
	@MethodSource("empleados")
	@Test
	void testPlus(double sueldoPlus) {

	}
	
	@ParameterizedTest
	@MethodSource("empleados")
	@Test
	void testEqualsEmpleado() {
		Empleado em1 = new Empleado("Karim", "Benzema", 34, 12);
		Empleado em2 = new Empleado("Luka", "Modric", 36, 10);
		assertTrue(em1.equals(em2));
	}
	
	@ParameterizedTest
	@MethodSource("empleados")
	@Test
	void testCompareTo() {
		Empleado em1 = new Empleado("Karim", "Benzema", 34, 12);
		Empleado em2 = new Empleado("Luka", "Modric", 36, 10);
		assertEquals(em.MAYOR, em2.compareTo(em1));
	}

}
