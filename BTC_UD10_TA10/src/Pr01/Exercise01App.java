package Pr01;

/**
 * @author: J.Oriol López Bosch
 * @Date: 20.04.2022
 * @Version: 0.1.1
 */
import java.util.InputMismatchException;
import java.util.Scanner;

import Tools.NumberRandomClass;

public class Exercise01App {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static int numAdivinar=0;
	public static int numInput=0;
	public static int contador=0;

	public static void main(String[] args) {
		//Calling to the method from the object NumberClass and generate number and asign it to the variable
		numAdivinar = NumberRandomClass.generarNumero(1, 499);
		
		//Asking for an input and controling the exceptions
		do {
			try {
				System.out.println("Introduce el número que quieres adivinar");
				numInput = scan.nextInt();
				if(numAdivinar>numInput) {
					System.out.println("El número es mas grande");
					contador++;
				}else {
					System.out.println("El número es mas pequeño");
					contador++;
				}
			}catch(InputMismatchException e) {
				System.out.println("Solo se pueden introducir números enteros");
				contador++;
				scan.nextLine();
			}
		}while(numAdivinar!=numInput);
			System.out.println("Acertaste el número y lo has intentado: "+contador+" veces");
		
	}

}
