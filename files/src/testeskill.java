
public class testeskill {

	public static void main(String[] args) {
		/*
		try {
			op(0);
		}
		catch(final illegalArgumentException e)
		{
			System.out.println("X");
		}
		catch(final Exception e)
		{
			System.out.println("Y");
		}
		finally
		{
			System.out.println("Z");
		}
		*/
		int x = 5;
		int y = 10;
		decrescente(x);
		System.out.println(soma(x, y));			
		
	}
	
	public static void decrescente(Integer x)
	{
		int count = x;
		for(int i = 0; i < count + 1; i++)
		{
			System.out.println(x);
			x--;
		}		
	}
	
	public static double soma(double x, double y)
	{			
		return x + (x * y/100);
	}
	
	/*
	private static void op(final int v) throws illegalArgumentException
	{
		if(v == 0) throw new illegalArgumentException("U");
	}
	 */

}
