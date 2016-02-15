package it.ExpressionMath;

import java.util.Arrays;
import java.util.Scanner;

public class MathExp {

	public void printMathExp(){
		sc = new Scanner(System.in);
		
		System.out.println("Inserisci l'espressione matematica");
		String readExpression = sc.nextLine();
		sc.close();
		String[] splitExpression = readExpression.split("");
		
		System.out.println(Arrays.toString(splitExpression) );
		
		for (int i = 0; i < splitExpression.length; i++) {
			if (splitExpression[i].equals("+")) {
				numberOne = Integer.parseInt(splitExpression[i-1]);
				numberTwo = Integer.parseInt(splitExpression[i+1]);
				resultParzial = numberOne+numberTwo;
				System.out.println(resultParzial);
				splitExpression[i+1] = Integer.toString(resultParzial);
			}
			if (splitExpression[i].equals("-")) {
				numberOne = Integer.parseInt(splitExpression[i-1]);
				numberTwo = Integer.parseInt(splitExpression[i+1]);
				if(numberOne>numberTwo){
					resultParzial = numberOne-numberTwo;
					System.out.println(resultParzial);
					splitExpression[i+1] = Integer.toString(resultParzial);
				}else{
					resultParzial = numberTwo-numberOne;
					System.out.println(resultParzial);
					splitExpression[i+1] = Integer.toString(resultParzial);
				}
				
			}
			if (splitExpression[i].equals("*") || splitExpression[i].equals("x")) {
				numberOne = Integer.parseInt(splitExpression[i-1]);
				numberTwo = Integer.parseInt(splitExpression[i+1]);
				System.out.println(numberOne*numberTwo);
			}
			if (splitExpression[i].equals("/") || splitExpression[i].equals(":")) {
				numberOne = Integer.parseInt(splitExpression[i-1]);
				numberTwo = Integer.parseInt(splitExpression[i+1]);
				if(numberOne>numberTwo){
					System.out.println(numberOne/numberTwo);
				}else{
					System.out.println("Errore, controllare il dividendo è più piccolo del divisore");
				}
				
			}
//			if ( !( splitExpression[i].equals("+") || splitExpression[i].equals("-") || splitExpression[i].equals("*") || splitExpression[i].equals("x") || splitExpression[i].equals("/") || splitExpression[i].equals(":")) ){
//				System.out.println("iao");
//			}
		}
		
	}
	
	private static Scanner sc;
	private static int numberOne;
	private static int numberTwo;
	private static int resultParzial;

	public int getAdd(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
