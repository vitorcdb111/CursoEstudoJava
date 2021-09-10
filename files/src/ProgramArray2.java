import java.util.Scanner;

import entities.Array2;

public class ProgramArray2 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("tamanho do vetor: ");
		int n = sc.nextInt();
		
		//criando um vetor
		//declara o tipo + [] + nomedavariavel = new double[tamanhodovetor]
		Array2[] vect = new Array2[n];
		
		for(int i = 0; i < vect.length; i++)
		{
			sc.nextLine();
			String name = sc.nextLine();
			double value = sc.nextDouble();
			
			//apontando para o novo objeto
			vect[i] = new Array2(name, value);
		}
		
		double sum = 0;
		
		for(int i = 0; i < n; i++)
		{
			sum += vect[i].getValue();
		}
		
		double avg = sum / vect.length;
		
		System.out.println("Media = " + avg);
		
		sc.close();

	}

}
