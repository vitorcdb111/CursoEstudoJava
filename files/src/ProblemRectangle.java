import java.util.Scanner;

import entities.Rectangle;

public class ProblemRectangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		System.out.println(rec);
		
		
		sc.close();
	}

}
