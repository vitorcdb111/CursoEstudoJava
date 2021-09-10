import java.util.Scanner;

import entities.Array2;
import entities.Rent;

public class ProblemRent {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int n;
		Rent[] vet = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();		
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println();
			System.out.println("Rent#: " + i + ":");
			System.out.print("nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("email: ");
			String email = sc.nextLine();
			System.out.print("room: ");
			int room = sc.nextInt();
			vet[room] = new Rent(name, email);
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10; i++)
		{			
			if(vet[i] != null)
				System.out.println(i + " : " + vet[i].getName() + ", " + vet[i].getEmail());
		}
		
		sc.close();

	}

}
