import java.util.Scanner;

public class ProgramArray {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("tamanho do vetor: ");
		int n = sc.nextInt();
		
		//criando um vetor
		//declara o tipo + [] + nomedavariavel = new double[tamanhodovetor]
		double[] vect = new double[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("valor a ser inserido: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		for(int i = 0; i < n; i++)
		{
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.println("Media = " + avg);
		
		sc.close();

	}

}
