import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.ProductEnum;
import enums.OrderStatus;

public class ProgramFinalEnum {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data");
		System.out.print("Name:");		
		String name = sc.nextLine();
		System.out.println();
		System.out.print("Email:");
		String email = sc.nextLine();
		System.out.println();
		System.out.print("Birth date (DD/MM/YYYY):");
		Date birth = sdf.parse(sc.next());
		System.out.println();		
		System.out.println("Enter order data");
		System.out.print("Status:");
		OrderStatus status = OrderStatus.valueOf(sc.next());				
		
		Client client = new Client(name, email, birth);
		Order order = new Order(new Date(), status, client);
		
		
		System.out.println();		
		System.out.println("How many items to this order?");		
		int number = sc.nextInt();
		
		for(int i = 0; i < number; i++)
		{
			System.out.printf("Enter #%s item data: \n", i+1);
			System.out.print("Product name:");
			String productName = sc.nextLine();
			System.out.println();
			sc.next();
			System.out.print("Product price:");
			double price = sc.nextDouble();
			System.out.print("Quantity:");
			int quantity = sc.nextInt();
			ProductEnum produto = new ProductEnum(productName, price);
			OrderItem orderItem = new OrderItem(quantity, price, produto);
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		sc.close();
	}

}
