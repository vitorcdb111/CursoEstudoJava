package secao14HerencaPolimorfismo;

import entities.secao14HerencaPolimorfismo.Employee;
import entities.secao14HerencaPolimorfismo.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise1 {
    public static void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Employee> em = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int number = sc.nextInt();
        String name;
        int hours;
        double valuePerHour;
        double additionalCharge;

        while(number > 0)
        {
            System.out.print("Outsourced Employee?[y/n] ");
            char yn = sc.next().charAt(0);
            System.out.println();
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Hours: ");
            hours = sc.nextInt();
            System.out.print("Value per hour: ");
            valuePerHour = sc.nextDouble();
            sc.nextLine();
            if(yn == 'y')
            {
                System.out.print("Additional Charge: ");
                additionalCharge = sc.nextDouble();
                em.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge));
            }
            else
            {
                em.add(new Employee(name,hours,valuePerHour));
            }
            number--;
        }
        System.out.println("Payments:");
        for(Employee i : em)
        {
            System.out.println(i.getName() + " - $" + i.payment());
        }

        sc.close();
    }
}
