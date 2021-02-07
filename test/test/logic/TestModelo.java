package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {

	private Modelo modelo;
	private static int CAPACIDAD=100;

	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		// TODO
		assertTrue("El tamano deberia ser cero", modelo.darTamano()==0);
		setUp2();
		assertTrue("El tamano deberia ser el capturado en CAPACIDAD",modelo.darTamano()==CAPACIDAD);
	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
		setUp1();
		modelo.agregar("prueba");
		assertTrue("Debio haber agregado \"prueba\" ", modelo.darTamano()==1) ;

		setUp2();
		assertTrue(modelo.darTamano()==CAPACIDAD+1);
	}

	@Test
	public void testBuscar() {
		// TODO Completar la prueba
		modelo.agregar("Hola");
		assertEquals( "No busco correctamente.", "Hola", modelo.buscar("Hola") );     

		setUp2();
		assertTrue("Debio haber encontrado el numero 6", modelo.buscar("6").compareTo("6")==0) ;

	}

	@Test
	public void testEliminar() {
		// TODO Completar la prueba
		modelo.agregar("Hola");   
		assertEquals( "No elimino correctamente.", "Hola", modelo.eliminar("Hola") );     
		assertEquals( "No se redujo el tamano del arreglo.", 0, modelo.darTamano() );     


		setUp2();
		assertTrue("No elimino el numero 6", modelo.eliminar(""+6).compareTo(""+6)==0) ;
	}

}
