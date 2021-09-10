package secao15Excecoes;

import entities.secao15Excecoes.Account;
import entities.secao15Excecoes.exceptions.Exercise2Exception;

import java.text.ParseException;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Holder: ");
        String holder = sc.next();
        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();

        try
        {
            account.withdraw(amount);
            System.out.print("New balance: " + account.getBalance());
        }
        catch(Exercise2Exception e)
        {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
