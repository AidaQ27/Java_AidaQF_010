package Test05;

import java.util.Random;

public class Password {
	//Atributos de la clase
		private int longitud;
		private String contrasenya;
		private boolean fuerte;
		


	// Constructores

	// Constructor por defecto, que no se le pasa nada por parametro. LONGITUD 8.
	public Password(){
		this.longitud = 8;
		this.contrasenya = contrasenyaAleatoria();
		esFuerte();
		}

	//Constructor con la longitud introducida por el constructor
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasenya = contrasenyaAleatoria();
		esFuerte();
	}

	//getters & setters
	//getter = pedir
	//setter = modificar

	//Devuelve la lontitud de la contraseña
	public int getLongitud() {
		return longitud;
	}

	// Para modificar la longitud
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	// Devuelve la contraseña
	public String getContrasenya() {
		return contrasenya;
	}

	// Puede modificar la contraseña
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	

	public boolean isFuerte() {
		return fuerte;
	}

	public void setFuerte(boolean fuerte) {
		this.fuerte = fuerte;
	}

	public String contrasenyaAleatoria() {
		String contrasenya = "";
		
		final char[] numeros = {'1','2','3','4','5','6','7','8','9',};
		final char[] minisculas = {'a','b','c','d','e','f','g','h','i',};
		final char[] mayusculas = {'A','B','C','D','E','F','G','H','I',};
		// Creamos un nuevo objeto random
		Random aleatoria = new Random();
		for (int i = 0; i < longitud; i++) {
			int numero = (int) (Math.random() * 3) + 1;
			if (numero == 1) {
				contrasenya += numeros[aleatoria.nextInt(numeros.length)];		
			}else if (numero == 2) {
				contrasenya += minisculas[aleatoria.nextInt(numeros.length)];
			}else{
				contrasenya += mayusculas[aleatoria.nextInt(numeros.length)];
				}
			}
	
		//System.out.println(contrasenya);
		return contrasenya;
	}
	
	public void esFuerte() {
	//numeros = 6, minisculas = 1, mayusculas = 2
	int contadorNumeros = 0;
	int contadorMinus = 0;
	int contadorMayus = 0;
	
	for (int i = 0; i < contrasenya.length(); i++) {
		  char desglose = contrasenya.charAt(i);
		  if (Character.isDigit(desglose)) {
			  contadorNumeros++;
		  }else if (Character.isUpperCase(desglose)) {
			  contadorMayus++;	  
		  }else {
			  contadorMinus++;
		  }
		 
	}
	if (contadorNumeros>6 && contadorMinus>1 && contadorMayus>2) {
		this.fuerte = true;
	}else {
		this.fuerte = false;
	}

	}

	//Imprimir Longitud + contraseña
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrasenya=" + contrasenya + ", fuerte=" + fuerte + "]";
	}
	
	
	
	
	



}
