import java.util.Locale;
import java.util.Scanner;

public class TesteDebug {
	public static void main(String[] args) {
		
		//P iniciar a execucao passso a passo ca:
		//debug as -> java aplication
		
		
		//trocando virgula por ponto
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		//marcando um breakpoint nessa linha
		double metroQuadrado = sc.nextDouble();
		
		//p seguir clique F6
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}
}