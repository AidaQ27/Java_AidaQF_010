package Test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdivinoNum numero = new AdivinoNum(); // Creo el objeto AdivinoNUm
		
		numero.crearAleatorio();
	
		do {
			numero.introducirNum();
			numero.comparar();
		}while(numero.getNumero() != numero.getNumAleatorio());
			
		
		
		
	}
}