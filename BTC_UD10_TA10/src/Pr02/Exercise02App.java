package Pr02;

import CustomExceptions.MyException;

/**
 * @author: J.Oriol López Bosch
 * @Date: 20.04.2022
 * @Version: 0.1.1
 */

public class Exercise02App {

	public static void main(String[] args) {
		
		//Provoking my own exception
		try {
			throw new MyException ();
		}catch(MyException e) {
			System.out.println(e);
		}

	}

}
