package entities;

public class Dollar {
	
	public static double TAXA = 0.06;
	
	public static double converter(double dollar, int quantity)
	{
		double value;
		
		value = dollar * quantity;
		value += value * TAXA;
		
		return value;
	}

}
