import java.util.Scanner;

import entities.Bank;

public class ProblemBank {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String accountBank;
		String name;
		String dp;
		double value = 0;
		double newValue = 0;
		
		System.out.print("Enter account number: ");
		accountBank = sc.next();
		System.out.print("Enter account holder: ");
		name = sc.next();
		System.out.print("Is there an initial deposit (y/n)? ");
		dp = sc.next();
		//para ler um char
		//char response = sc.next().charAt(0)
		if(dp.equals("y"))
		{
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
		}		
		
		Bank bank = new Bank(accountBank, name, value);
		System.out.println();
		System.out.println("------------------------------//--------------------------------");
		System.out.println("Account data: ");
		System.out.println("Account " + bank.getAccountBank() + ", Holder: " + bank.getName() + ", Balance: $" + bank.getInitialValue());
		System.out.println("------------------------------//--------------------------------");
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		System.out.println("Update data: ");
		newValue = sc.nextDouble();
		bank.deposit(newValue);
		System.out.println("Account " + bank.getAccountBank() + ", Holder: " + bank.getName() + ", Balance: $" + bank.getInitialValue());
		System.out.println("------------------------------//--------------------------------");
		
		System.out.println();
		newValue = 0;
		System.out.println("Enter a withdraw value: ");
		System.out.println("Update data: ");
		newValue = sc.nextDouble();
		bank.withdraw(newValue);
		System.out.println("Account " + bank.getAccountBank() + ", Holder: " + bank.getName() + ", Balance: $" + bank.getInitialValue());
		
		sc.close();
		
	}

}
