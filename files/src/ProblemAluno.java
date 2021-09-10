import java.util.Scanner;

import entities.Aluno;

public class ProblemAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();	
		
		aluno.nome = sc.next();
		aluno.pT = sc.nextDouble();
		aluno.sT = sc.nextDouble();
		aluno.tT = sc.nextDouble();
		
		System.out.println(aluno);
		
		sc.close();
	}

}
