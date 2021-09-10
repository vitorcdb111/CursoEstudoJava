import java.util.Scanner;

import entities.Product;

public class ProblemStock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//o construtor padrao n pode mais ser utilizado
		//Product produto = new Product();		
		int add, remove;
		
		//para isso criamos variaveis temporarias
		String name = sc.next();
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		
		//agora criamos o construtor com as variaveis
		Product produto = new Product(name, price, quantity);
		
		System.out.println(produto);
		//System.out.println("Nome: " + produto.name + " Price: " + produto.price + " Quantity: " + produto.quantity + " Total: " + produto.TotalValueInStock());
		
		add = sc.nextInt();
		produto.AddProducts(add);
		System.out.println(produto);
		//System.out.println("Nome: " + produto.name + " Price: " + produto.price + " Quantity: " + produto.quantity + " Total: " + produto.TotalValueInStock());
		
		
		remove = sc.nextInt();
		produto.RemoveProducts(remove);
		System.out.println(produto);
		//System.out.println("Nome: " + produto.name + " Price: " + produto.price + " Quantity: " + produto.quantity + " Total: " + produto.TotalValueInStock());
		
		sc.close();
	}

}
