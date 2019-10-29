package es.upm.grise.profundizacion2019.ex1;

public class ClaseExamen {
	
	public ClaseExamen() {
		
	}
	
	public float metodoAProbar(int a, int b) {
		//nodo 1
		float result = 0;
		
		while( a > b) {
			//nodo 2
			a--;
		}
		//nodo 3
		if (a <= b) {
			//nodo 4
			result = 0;
		}
		else {
			//nodo 5
			result = b;
		}
		//nodo 6
		return result;
	}

}
