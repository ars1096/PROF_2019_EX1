package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClaseExamenTest {
	public ClaseExamen value = new ClaseExamen();
	
	@Test
	public void test() {
	// a=b  1,3,4,6
	assertEquals(0f, value.metodoAProbar(1, 1),0.0f);
	// a > b 1,2,3,4,6
	assertEquals(0f, value.metodoAProbar(5, 1),0.0f);
	// a < b 1,3,6
	assertEquals(0f, value.metodoAProbar(1, 5),0.0f);
	}

}
