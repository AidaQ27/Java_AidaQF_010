package Test04;

import java.util.InputMismatchException;
import java.util.Scanner;

import ExceptionPersonalizado.Miexcepcion;

public class Calculadora {
	
	// Atributos
	int primerNum;  // Los asignamos sin valor
	int segundoNum;
	
	
	
	// Constructor
	public Calculadora() {
	
	}

	
	// Metodos para relaizar las operaciones
	
	public void operacionSuma(int primerNum, int segundoNum) throws Miexcepcion { // le indicamos que el metodo tendrá una excepcion
		if (primerNum <= 0 || segundoNum <= 0) {throw new Miexcepcion(5);} // pasamos la condicion y throw para especificar la excepcion caturada
		
		System.out.println("La suma es: " + (primerNum+segundoNum));
		
	}
	public void operacionResta (int primerNum, int segundoNum) throws Miexcepcion {
		if (primerNum <= 0 || segundoNum <= 0) {throw new Miexcepcion(5);}
		
		System.out.println("La resta es : " + (primerNum-segundoNum));
		
	}
	
	public void operacionMultiplicacion (int primerNum, int segundoNum) throws Miexcepcion {
		if (primerNum <= 0 || segundoNum <= 0) {throw new Miexcepcion(5);}
		
		System.out.println("La multiplicación es: " + (primerNum*segundoNum));
		
	}
	
	public void operacionDivision(int primerNum, int segundoNum) throws Miexcepcion { // le indicamos que este metodo tendrá una excepcion
		if (primerNum==0 || segundoNum==0) { throw new Miexcepcion(4);}
		
		System.out.println("La división es: " + (primerNum/segundoNum)); 
	} 
	
	public void operacionPotencia (int primerNum, int segundoNum) throws Miexcepcion {
		if (primerNum <= 0 || segundoNum <= 0) {throw new Miexcepcion(5);}
		
		System.out.println("La potencia es: " + Math.pow(primerNum, segundoNum) );
	}
	
	public void operacionRaizCuadrada (int primerNum) throws Miexcepcion {
		if(primerNum <= 0) {throw new Miexcepcion(5);}
		System.out.println("La raíz cuadrada es: " + Math.round(Math.sqrt(primerNum) * 100.0) / 100.0);
	}
	
	public void operacionRaizCubica(int primerNum) throws Miexcepcion {
		if(primerNum <= 0) {throw new Miexcepcion(5);}
		System.out.println("La raíz cúbica es :  " + Math.round(Math.cbrt(primerNum) * 100.0) / 100.0);
	}
	
	
	public void escoger() { //Metodo para escoger 
		Scanner sc = new Scanner(System.in);
		
		int escoge = 10;
		
		do {
		System.out.println("Que operaciones desesas realizar? : ");
		System.out.println("1 - Suma ");
		System.out.println("2 - Resta ");
		System.out.println("3 - Multiplicacion ");
		System.out.println("4 - Division ");
		System.out.println("5 - Potencia");
		System.out.println("6 - Raíz cuadrada ");
		System.out.println("7 - Raíz cubica");
		try {
			escoge = sc.nextInt();
			
			if(escoge != 0) {
				opcionElegida(escoge);
				System.out.println("\nPulsa '0' para salir ");
			}

		}catch (InputMismatchException e) {
			System.out.println("El valor introducido no es correcto!! ErrorCapturado: " + e);
		}
		
		}while(escoge != 0); // mientras escoge sea diferente a '0', podrá salir del bucle
		System.out.println("Has querido salir. Adiós");
		
		
			
	}
	
	
		
	public void opcionElegida(int escoge) {
		switch (escoge) { // TRY CATCH para capturar el error
		case 1:
			pedirDoble();
			try { // se ejecuta si todo va bien
				operacionSuma(primerNum, segundoNum);
			}catch (Miexcepcion ex) { // si no sale por el catch. con el error capturado
				System.out.println(ex.getMessage());
			}
			
			
			break;
		case 2:
			pedirDoble();
			try { 
				operacionResta(primerNum, segundoNum);
			}catch (Miexcepcion ex) {
				System.out.println(ex.getMessage());
			}
			
			
			break;
		
		case 3:
			pedirDoble();
			try { 
				operacionMultiplicacion(primerNum, segundoNum);
			}catch (Miexcepcion ex) {
				System.out.println(ex.getMessage());
			}
			
			break;
		
		case 4:
			pedirDoble();
			try {
				operacionDivision(primerNum, segundoNum);
			}catch (Miexcepcion ex) {
				System.out.println(ex.getMessage());
			}
			
			
			break;
		
		case 5:
			pedirDoble();
			
			try {
				operacionPotencia(primerNum, segundoNum);
			}catch (Miexcepcion ex) {
				System.out.println(ex.getMessage());
			}
			
			
			break;
			
		case 6:
			pedirUnico();
			try {
				operacionRaizCuadrada(primerNum);
			}catch (Miexcepcion ex) {
				System.out.println(ex.getMessage());
			}
			
		
			
			break;
		
		case 7:
			pedirUnico();
			try {
				operacionRaizCubica(primerNum);
			}catch (Miexcepcion ex) {
				System.out.println(ex.getMessage());
			}
			
			break;
		
		default:
			System.out.println("Esta operacion no esta disponible");
			break;
		}
		
		
	}
	
	public void pedirDoble() { // Metodo para pedir 2 numeros
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero:  ");
		int primerNum = sc.nextInt();
		this.primerNum = primerNum;
		
		System.out.println("Introduce otro numero:  ");
		int segundoNum = sc.nextInt();
		this.segundoNum = segundoNum;
		
			
	}
	
	public void pedirUnico() { // metodo para pedir 1 numero
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero:  ");
		int primerNum = sc.nextInt();
		this.primerNum = primerNum;
		
		
	}
	
	
	
 }


