import java.util.Scanner;

import entities.Dollar;

public class ProgramDollar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double dollar;
		int quantity;
		
		dollar = sc.nextDouble();
		quantity = sc.nextInt();			
		
		System.out.println("Valor a pagar: " + Dollar.converter(dollar, quantity));
		
		sc.close();
	}
	

}
