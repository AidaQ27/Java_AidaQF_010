package Test03;
import java.util.Random;

import ExceptionPersonalizado.Miexcepcion;


public class NumeroAleatorio {
	
	public NumeroAleatorio(int min, int max) {
		Random random = new Random();
		
		int aleatorio = random.nextInt(max + min) + min;
		
		try {
			System.out.println("Generando numero aleatorio....");
			System.out.println("El numero aleatorio es: " + aleatorio);
			if (aleatorio % 2 == 0){ throw new Miexcepcion(1);}
			else { throw new Miexcepcion(2);}
			
		} catch (Miexcepcion ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}
	
}
	



