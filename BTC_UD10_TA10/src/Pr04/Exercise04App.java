package Pr04;

import java.util.InputMismatchException;
import java.util.Scanner;

import CustomExceptions.MyException;
import CustomExceptions.NegativeNumberException;
import Tools.MatematicOperationsClass;

/**
 * @author: J.Oriol López Bosch
 * @Date: 20.04.2022
 * @Version: 0.1.1
 */

public class Exercise04App {
	
	public static Double num 	=0.0;
	public static Double num2	=0.0;
	public static int opcion 	= 0;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		menu();
		
	}
//Methods
	//Calling menu
	private static void menu() {
		do {
			System.out.println("Que operación quieres utilizar");
			System.out.println("1-Suma\n2-Resta\n3-Multiplicación\n4-Potencia"
					+ "\n5-Raíz cuadrada\n6-Raíz cúbica\n7-División");
			try {
				//Capture input with control of errors
				opcion = scan.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Opción no válida\n");
				//Cleaning the scanner
				scan.nextLine();
			}
		}while(opcion>8||opcion<1);
		//Getting the correct option
		switch(opcion){
		case 1://Suma
			num 	= setNumberDouble();
			num2 	= setNumberDouble();
			
			System.out.println("El resultado de la suma es: "
			+MatematicOperationsClass.suma(num, num2));
			break;
		case 2://Resta
			num 	= setNumberDouble();
			num2 	= setNumberDouble();
			
			System.out.println("El resultado de la resta es: "
			+MatematicOperationsClass.resta(num, num2));
			break;
		case 3://Multiplicación
			num 	= setNumberDouble();
			num2 	= setNumberDouble();
			
			System.out.println("El resultado de la multiplicacion es: "
			+MatematicOperationsClass.multiplicacion(num, num2));
			break;
		case 4://Potencia
			num 	= setNumberDouble();
			num2 	= setNumberDouble();
			
			System.out.println("El resultado de la potencia es: "
			+MatematicOperationsClass.potencia(num, num2));
			break;
		case 5://Raíz cuadrada
			num 	= setNumberDouble();
			
			try {
				if(num<0) {
					throw new NegativeNumberException();
				}
				
			}catch(NegativeNumberException e) {
				System.out.println(e);
				break;
			}

			System.out.println("El resultado de la raíz cuadrada es: "
			+MatematicOperationsClass.raizCuadrada(num));
			break;
		case 6://Raíz Cubica
			num 	= setNumberDouble();
			try {
				if(num<0) {
					throw new NegativeNumberException();
				}
				
			}catch(NegativeNumberException e) {
				System.out.println(e);
				break;
			}
			
			System.out.println("El resultado de la raíz cúbica es: "
			+MatematicOperationsClass.raizCuadrada(num));
			break;
		case 7://División
			num 	= setNumberDouble();
			num2 	= setNumberDouble();
			
			System.out.println("El resultado de la División es: "
			+MatematicOperationsClass.division(num, num2));
			break;
		}
	}
private static Double setNumberDouble() {
	boolean flag=false;
	Double retorno = 0.0;
	do {
		try {
			System.out.println("Introduce un número");
			retorno = scan.nextDouble();
			flag = true;
		}catch(InputMismatchException e) {
			System.out.println(e);
			System.out.println("Formato de número no correcto, recuerda que los doubles usan \",\"");
			scan.nextLine();
		}
	}while(!flag);
	
	return retorno;
}
	
}
