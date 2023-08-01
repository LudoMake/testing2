package funciones;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Funcion {

	@Test
	void testPar() {
		assertTrue(Utilidades.esPar(2));
		assertFalse(Utilidades.esPar(9));
		assertTrue(Utilidades.esPar(0));
		assertFalse(Utilidades.esPar(1));
	}
	
	@Test
	void testPrimo() {
		assertFalse(Utilidades.esPrimo(1));
		assertFalse(Utilidades.esPrimo(10));
		assertTrue(Utilidades.esPrimo(3));
		assertTrue(Utilidades.esPrimo(2));
		assertFalse(Utilidades.esPrimo(-1));
		assertFalse(Utilidades.esPrimo(0));
		
	}
	
	@Test
	void testFactorial() {
		assertThrows(ArithmeticException.class, ()->Utilidades.factorial(-1), "Este nº no es factorial");
		assertEquals(24,Utilidades.factorial(4), "El factorial es correcto");
		assertEquals(1, Utilidades.factorial(0), "Este nº no es factorial");

	}
	
	@Test
	void testrotarDerecha() { //creamos 2 arrays porque el metodo no devuelve nada
		int [] aux = {1, 2, 3}; //creamos un array
		int [] v = {3, 1, 2}; //creamos otro array con los numeros cambiados
		Utilidades.rotarDerecha(aux); //llamamos a "a" porque esta en orden
		assertArrayEquals(aux, v); // aqui invocamos a las variables
	}
	
	@BeforeAll //estos si van con static
	public static void inicializar() {
		System.out.println("Iniciando test...");
	}
	
	@AfterAll //estos si van con static
	public static void finalizar() {
		System.out.println("Liberando los recursos...");
	}
	
	@BeforeEach //estos van sin static
	public void inicioTest() {
		System.out.println("Iniciando nuevos test...");
	}
	
	@AfterEach //estos van sin static
	public void finTest() {
		System.out.println("Finalizando los test...");
	}
}
