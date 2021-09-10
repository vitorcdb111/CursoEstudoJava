package entities;

public class Rectangle {
	
	public double width;
	public double height;

	public double area()
	{
		double area;
		area = width * height;
		
		return area;
	}
	
	public double perimeter()
	{
		double perimeter;
		perimeter = (width * 2) + (height * 2);
		
		return perimeter;
	}
	
	public double diagonal()
	{
		double diagonal;
		diagonal = Math.sqrt((Math.pow(width, 2)) + (Math.pow(height, 2)));
		
		return diagonal;
	}
	
	public String toString()
	{
		return "AREA = " + area() + " PERIMETER = " + perimeter() + " DIAGONAL = " + diagonal();
	}
	
}
