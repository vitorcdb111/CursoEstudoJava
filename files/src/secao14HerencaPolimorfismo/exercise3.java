package secao14HerencaPolimorfismo;

import entities.secao14HerencaPolimorfismo.Empregado;
import entities.secao14HerencaPolimorfismo.PessoaFisica;
import entities.secao14HerencaPolimorfismo.PessoaJuridica;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        List<Empregado> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new PessoaFisica(name, income, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new PessoaJuridica(name, income, numberOfEmployees) {
                });
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        for(Empregado ep:  list)
        {
            System.out.println(ep.calcImposto());
        }

        sc.close();
    }
}
