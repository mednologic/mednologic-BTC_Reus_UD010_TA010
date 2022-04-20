package CustomExceptions;

public class NegativeNumberException extends Exception {
	
	//Output
		public String toString() {
			String sms="No puede ser un valor negativo";
			return sms;
		}

}
