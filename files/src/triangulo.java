import java.util.Scanner;
import java.math.*;

public class triangulo {
	
	public static void main(String[] args) {	
		//Primeiro Triangulo	
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		int p = (x + y + z) / 2;
		
		int area = p*(p - x ) * (p -y) * (p - z);
		double result1 = Math.sqrt(area);
		
		//Segundo Triangulo	
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		int p2 = (x + y + z) / 2;
		
		int area2 = p2*(p2 - x ) * (p2 -y) * (p2 - z);
		double result2 = Math.sqrt(area2);
		
		System.out.println("Triangulo 1 area: " + result1);
		System.out.println("Triangulo 2 area: " + result2);
		
		if(result1 > result2)
		{
			System.out.println("Maior: 1");
		}
		else
		{
			System.out.println("Maior: 2");
		}
		
		sc.close();

	}	

}
