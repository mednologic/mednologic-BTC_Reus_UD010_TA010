package Pr03;

import CustomExceptions.ExepcionEvenOdd;
import CustomExceptions.MyException;
import Tools.NumberRandomClass;

/**
 * @author: J.Oriol López Bosch
 * @Date: 20.04.2022
 * @Version: 0.1.1
 */

public class Exercise03App {
	public static int num = 0;

	public static void main(String[] args) {
		//Calling to Method from NumberRandomClass to generate a random number
		num = NumberRandomClass.generarNumero(0,999);
		try {
			throw new ExepcionEvenOdd (num);
		}catch(ExepcionEvenOdd e) {
			//Output of the exception
			System.out.println(e);
		}

	}

}
