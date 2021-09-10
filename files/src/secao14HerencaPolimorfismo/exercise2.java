package secao14HerencaPolimorfismo;

import entities.secao14HerencaPolimorfismo.ImportedProduct;
import entities.secao14HerencaPolimorfismo.Product;
import entities.secao14HerencaPolimorfismo.UsedProduct;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise2 {
    public static void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products ");
        int number = sc.nextInt();
        while(number > 0)
        {
            number--;
            System.out.print("Common, used or imported (c/u/i)? ");
            char op = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(op == 'i')
            {
                System.out.print("Custom fee: ");
                Double fee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, fee));
            }
            else if(op == 'c')
            {
                list.add(new Product(name, price));
            }
            else
            {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dt = sc.next();
                list.add(new UsedProduct(name, price, dt));
            }
        }

        System.out.println("PRICE TAGS:");
        for(Product prod:  list)
        {
            System.out.println(prod.priceTag());
        }
        sc.close();
    }
}
