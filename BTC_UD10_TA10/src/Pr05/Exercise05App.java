package Pr05;

import java.util.InputMismatchException;
import java.util.Scanner;

import Class.PasswordClass;

/**
 * @author: J.Oriol López Bosch
 * @Date: 21.04.2022
 * @Version: 0.1.1
 */


public class Exercise05App {
	
	public static Scanner scan = new Scanner(System.in);
	public static int tamanyoArray = 0;
	public static int longitudP = 0;
	public static PasswordClass [] arrayPasswords;
	public static boolean [] calidadPasswords;

	public static void main(String[] args) {
		
		tamanyoArray = pedirInt("Introduce que cantidad de passwords quieres");
		
		//Creating the arrays with the size input
		arrayPasswords = new PasswordClass[tamanyoArray];
		calidadPasswords = new boolean [tamanyoArray];
		
		longitudP = pedirInt("Introduce que longitud que quieres que tengan los passwords");
		
		for(int i=0; i<tamanyoArray;i++) {
			arrayPasswords[i] 	= new PasswordClass(longitudP);
			calidadPasswords[i] = PasswordClass.esFuerte(arrayPasswords[i].contrasenya);
			System.out.println(arrayPasswords[i].contrasenya+" "+calidadPasswords[i]);
		}

	}
//Methods

	//Request of int input
	private static int pedirInt(String frase) {
		boolean flagArray=false;
		int longi =0;
		do {
			System.out.println(frase);
			try {
				//Input of the size of the array
				longi = scan.nextInt();
				flagArray = true;
			}catch(InputMismatchException e) {
				System.out.println(e);
				//Cleaning the scanner
				scan.nextLine();
			}
		}while(!flagArray);
		return longi;
	}

}
