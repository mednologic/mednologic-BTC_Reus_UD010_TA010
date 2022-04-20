package CustomExceptions;

public class ExepcionEvenOdd extends Exception {
	
	public int num= 0;
	

	public ExepcionEvenOdd(int num) {
		this.num = num;
	}
	
	//Output
		public String toString() {
			String sms="Generando un número aleatorio\n"
					+ "El número generado es: "+num;
					if(num%2==0) {
						sms = sms + "\nEl número generado es par";
					}else {
						sms = sms + "\nEl número generado es impar";
					}
			
			return sms;
		}

}
