package CustomExceptions;

public class MyException extends Exception{
	
	
	//Empty constructor
	public MyException (){
		
	}
	//Output
	public String toString() {
		String sms="Mensaje mostrado por pantalla\n"
				+ "Excepción capturada con mensaje:"
				+ "Esto es un objeto Exception\n"
				+ "Programa terminado";
		
		return sms;
	}
	

}
