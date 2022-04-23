package Test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		// Creamos un numero aleatorio que tendrá que ser adivinado
		int numAleatorio = (int) (Math.random()*500);
		
		// Creo las variables
		int numero = 0;
		int veces = 0;
		int vecesError = 0;
		
		do {
			boolean leido = true;
			do {
				System.out.println("Introduce un numero del 1 al 500: "); //Introducimos el numro poer scanner
				
				try {
					//acciones
					numero = sc.nextInt();	// Guardamos el numero introducido en la variable numero
					veces++;				// Acumulamos el numero de veces que lo intentamos
					System.out.println("El numero introducido es: " + numero); // Mostramos que numero hemos introducido
					
					leido = true; //Pasamos la condicion a true
				
				}catch (InputMismatchException e) { // Capturamos la excepcion
					//acciones
					System.out.println("El valor introducido no es correcto!! ErrorCapturado: " + e); // Le indicamos que el valor introducido no es correcto
					sc.next(); // Para que busque el siguiente numero
					vecesError++;
					leido = false;
				}
			}
			while(leido==false);
		
			
			if(numero < numAleatorio) {
				System.out.println("El numero buscado es mayor que el introducido.");
				System.out.println("_______________________________________________");
			}
			
			if(numero > numAleatorio) {
				System.out.println("El numero buscado es menor que el introducido.");
				System.out.println("_______________________________________________");
			}
		}
		while(numero != numAleatorio);
		
		System.out.println(" ** GENIAL ** Has encontrado el numero aleatorio " + numAleatorio + ". Has introducido numeros válidos " + veces + " veces.");
		System.out.println(" Te has equivocado al introducir otros valores " + vecesError + " veces." );
		
	}
}


	
