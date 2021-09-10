package entities;

public class Aluno {
	
	public String nome;
	public double pT;
	public double sT;
	public double tT;
	
	public double media()
	{
		double media;
		media = (pT + sT + tT) / 3;
		
		return media;
	}
	
	public String situacao(double media)
	{
		String situacao;
		double aprovado = 6;
		if(media >= aprovado)
		{
			situacao = "PASS";
		}
		else
		{					
			double diferenca;
			
			diferenca = Math.abs(media - 6);
			
			situacao = "FAILED " + "MISSING " + diferenca + " POINTS";
		}
		
		
		return situacao;
	}
	
	
	public String toString()
	{
		return "FINAL GRADE = " + media() + " " + situacao(media());
	}

}
