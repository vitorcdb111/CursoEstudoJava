package entities;

public class Bank {
	
	private String accountBank;
	private String name;
	private double initialValue;
	
	public Bank(String accountBank, String name, double initialValue)
	{
		this.accountBank = accountBank;
		this.name = name;
		deposit(initialValue);
	}
	
	public Bank(String accountBank, String name)
	{
		this.accountBank = accountBank;
		this.name = name;
	}	
	
	public String getAccountBank()
	{
		return accountBank;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getInitialValue()
	{
		return initialValue;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double deposit(double value)
	{
		initialValue += value;
		return initialValue;
	}
	
	public double withdraw(double value)
	{
		initialValue -= value + 5;
		return initialValue;
	}
	

}
