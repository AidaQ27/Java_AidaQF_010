package Test02;

import java.util.Scanner;

import ExceptionPersonalizado.Miexcepcion;




public class Ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try { 
			
			throw new Miexcepcion(3);
			
		} catch (Miexcepcion ex) { //Si no se  introduce un entero entrará en el catch 
			System.out.println("Mensaje mostrado por pantalla" );
			System.out.println("Error capturado:" + ex.getMessage());
		} finally {
			System.out.println("Programa terminado");
		}
		
		
		
	}


}
