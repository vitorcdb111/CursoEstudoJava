package expicacoes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		System.out.println("Hello, World!!!!");
		
		/**
		 * OPERACOES BASICAS
		 * 
		 * Declarando uma variavel
		 * 
		 * <tipo> <nome> = <valor inicial> ;
		 * 
		 * Convencao p nome de variaveis:
		 * Nao pode comecar com digito: use uma letra ou _
		 * Nao pode ter espaco em branco
		 * Nao usar acentos ou ~ 
		 * Sugestao: use o padrao "camelCase"
		 * 
		 * Print formatado:
		 * System.out.println("%.2f%n", var);
		 * respectivos marcadores:
		 * %f - float
		 * %d - int
		 * %s - string
		 * %n - quebra de linha
		 * 
		 * Entrada de dados:
		 * Scanner sc = new Scanner(System.in);
		 * faca sc.close() quando nao precisar mais do objeto sc
		 * 
		 * Para ler uma palavra 
		 * x = sc.next();
		 * 
		 * Para ler um int
		 * x = sc.nextInt();
		 * 
		 *  P ler um char
		 *  x = sc.next().charAt(0);
		 *  
		 *  Para ler ate uma quebra de linha
		 *  x = sc.nextLine();
		 *  
		 *  Switch Case
		 *  
		 *  swicth(x)
		 *  {
		 *  	case1:
		 *  		dia = "Domingo";
		 *  		break;
		 *  	default:
		 *  		dia = "Valor Invalido";
		 *  }
		 *  
		 *  Operador Ternário
		 *  
		 *  (condicao) ? valor_se_verdadeiro : valor_se_falso
		 *  
		 *  Função:
		 *  Quando uma função retorna uma ação, chamamos de void(q é vazio)
		 *  
		 *  Quando eu delcaro uma variavel com FINAL siginifica q aquele valor nao podem mudar
		 *  public static final double PI = 3.14159;
		 *  o padrao de nome p constante é tudo maiusculo e se tiver espaco utilizar o underscore
		 *  NET_SALARY
		 *  
		 */
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		
		System.out.println(x);
		
		sc.close();		
		
	}
	

}
