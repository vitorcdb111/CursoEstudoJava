import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

import entities.Employee;

public class ProblemEmployee {
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int id, registered;
		String name;
		double salary;
		
		List<Employee> em = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		registered = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < registered; i++)
		{
			System.out.println("Employee #" + i+1 + ": ");
			System.out.print("Id: ");			
			id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			
			em.add(new Employee(id, name, salary));
			
		}		
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int nid = sc.nextInt();
		
		Employee emp = em.stream().filter(x -> x.getId() == nid).findFirst().orElse(null);
		if(emp != null)
		{
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextInt();
			emp.increaseSalary(percentage);
		}
		else
		{
			System.out.println("This id doesnt not exist!!");
		}
		
		System.out.println("List of employees: ");
		for(Employee i : em)
		{
			System.out.println(i);
		}

		sc.close();
	
	}	

}
