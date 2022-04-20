package Tools;

/**
 * @author: J.Oriol López Bosch
 * @Date: 20.04.2022
 * @Version: 0.2.1
 */

import java.util.Random;

public class NumberRandomClass {
	
	public static Random rdn  = new Random();
	
	public int number=0;
	
	
//Methods
	/**
	 * Generating number usings the parameters of input
	 * @return int
	 */
		public static int generarNumero(int inicio, int cantidad) {
			int temp=0;
			temp = (int) (rdn.nextDouble()*cantidad+inicio);
			return temp;
		}

}
