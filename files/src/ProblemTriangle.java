import java.util.Scanner;

import entities.Triangle;

public class ProblemTriangle {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		Triangle x, y;
		
		//Instanciando o objeto para que ele exista
		x = new Triangle();
		y = new Triangle();
		
		//Pedindo as medidas do triangulo x;
		System.out.println("Informe as medidas do Triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		//Pedindo as medidas do triangulo y;
		System.out.println("Informe as medidas do Triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//Calculando area de x
		double areaX = x.area();
		System.out.println("Triangulo 1 area: " + areaX);
		
		//Calculando area de y
		double areaY = y.area();
		System.out.println("Triangulo 2 area: " + areaY);
		
		//Verifica qual é o maior
		if(areaX > areaY)
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
