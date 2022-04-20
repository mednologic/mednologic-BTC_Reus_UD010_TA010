package Tools;

public class NumberEvenOdd {
	
	public int num;
	
	public NumberEvenOdd(int num) {
		this.num = num;
	}
	
//Methods
	public String evenOdd(int num) {
		String sms ="";
		if(num%2==0) {
			sms = "Número par";
		}else {
			sms = "Núnero impar";
		}
		return sms;
	}

}
