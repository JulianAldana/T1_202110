package test.data_structures;

import model.data_structures.ArregloDinamico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArregloDinamico {

	private ArregloDinamico<String> arreglo;
	private static int TAMANO=100;

	@Before
	public void setUp1() {
		arreglo= new ArregloDinamico<String>(TAMANO);
	}

	public void setUp2() {
		for(int i =0; i< TAMANO*2; i++){
			arreglo.agregar(""+i);
		}
	}

	@Test
	public void testArregloDinamico() {
		// TODO        
		assertNotNull( "El Arreglo Dinámico no fue inicializado. No puede ser null.", arreglo );

		arreglo.agregar("Hola");   
		assertEquals( "Deberia encontrar la palabra Hola.", "Hola", arreglo.buscar("Hola") );     
		assert arreglo.eliminar("Hola") == "Hola": "No eliminó correctamente";

	}

	@Test
	public void testDarElemento() {
		setUp2();
		// TODO
		for ( int i = 0; i<(arreglo.darTamano()-1); i++)
		{
			assert arreglo.darElemento(i).compareTo(""+i) == 0 : "Deberia entregar el elemento i.";
			assert arreglo.darElemento(i+1).compareTo(""+(i+1)) == 0 : "Deberia entregar el elemento i+1.";

		}
	}

}
