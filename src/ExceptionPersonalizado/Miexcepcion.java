package ExceptionPersonalizado;


public class Miexcepcion extends Exception{

	
		// recoge el codigo de la excepcion
		private int codigoException;
		
		//Constructor de clase
		public Miexcepcion(int codigoError) {
			super();
			this.codigoException = codigoError;
			
		}
		
		public Miexcepcion() {
			super();
		}

		//Metodo propio para mostrar tus mensajes
		@Override
		public String getMessage() {
			
			String mensaje="";
			
			
			switch (codigoException) {
			case 1:
				mensaje = "El valor introducido es par";
				
				break;
			case 2:
				mensaje = "El valor introducido es impar";
				
				break;
			
			case 3:
				mensaje = "Esto es un objeto Exception";
				
				break;

			case 4:
				mensaje = "El valor introducido NO puede ser divido";
				
				break;
			
			case 5:
				mensaje = "El valor introducido debe ser entero";
			default:
				break;
			}
			return mensaje;
		}
		
		
}


