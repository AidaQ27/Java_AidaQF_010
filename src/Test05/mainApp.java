package Test05;

import java.util.Iterator;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Password password = new Password();

		password.contrasenyaAleatoria();
		if (password.isFuerte()== false) {
			System.out.println("La contrase�a es d�bil");
		}else {
			System.out.println("La constrase�a es fuerte");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de contrase�as que quieres generar: ");
		int cantidadPass = sc.nextInt();
		
		System.out.println("Introduce la longitud de la contrase�a: ");
		int longitudPass = sc.nextInt();
		
		Password passwordArray[] = new Password[cantidadPass];
		for (int i = 0; i < cantidadPass; i++) {
			Password pssw = new Password(longitudPass);
			passwordArray[i] = pssw;
			System.out.println(passwordArray[i]);	
		}
	
		
		
	

}

	
}