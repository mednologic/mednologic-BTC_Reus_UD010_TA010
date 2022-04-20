package Tools;

public class MatematicOperationsClass {
	
	public Double num 	= 0.0;
	public Double num2 	= 0.0;
	
	
//Methods
	public static double suma (Double num, Double num2) {
		Double result = 0.0;
		result = num+num2;
		return result;
	}
	public static double resta (Double num, Double num2) {
		Double result = 0.0;
		result = num-num2;
		return result;
	}
	public static double multiplicacion (Double num, Double num2) {
		Double result = 0.0;
		result = num*num2;
		return result;
	}
	public static double division (Double num, Double num2) {
		Double result = 0.0;
		result = num/num2;
		return result;
	}
	public static double potencia (Double num, Double num2) {
		Double result = 0.0;
		result = Math.pow(num, num2);
		return result;
	}
	public static double raizCuadrada (Double num) {
		Double result = 0.0;
		result = Math.sqrt (num);
		return result;
	}
	public static double raizCubica (Double num) {
		Double result = 0.0;
		result = Math.pow (num,1.0/3.0);
		return result;
	}

}
