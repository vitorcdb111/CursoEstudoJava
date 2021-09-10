package secao14HerencaPolimorfismo;

import entities.secao14HerencaPolimorfismo.Account;
import entities.secao14HerencaPolimorfismo.BusinessAccount;
import entities.secao14HerencaPolimorfismo.SavingsAccount;

public class Program {
    public static void  main(String[] args)
    {
        BusinessAccount account = new BusinessAccount();

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0, 500.0);

        System.out.println("-------------------------");
        //UPCASTING
        System.out.println("Upcasting");
        //a sub classe(bussines account) também é uma classe(ou seja, bacc também é uma acc), por isso não da erro.
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Alice", 0.0, 0.01);

        Account acc6 = new Account(1001, "Alex", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1008, "Maria", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1009, "Bob", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());

        System.out.println("-------------------------");
        //DOWNCASTING
        System.out.println("Downcasting");
        //não é seguro fazer uma conversão de uma subclasse para super classe, pq nem sempre oq tem na super classe é oq ta na subclasse
        //mas é possivel fazer um casting manual para converter
        BusinessAccount acc4 = (BusinessAccount) acc2;

        //como a variavel acc3 é uma savingsaccount, ela não é um bussinesaccount, entao a operação não é permitida. So vai da problema quando executar a aplicação.
        //BusinessAccount acc5 = (BusinessAccount) acc3;
        //para evitar isso é necessario fazer um teste antes da conversao, utilizando o instanceof
        if(acc3 instanceof BusinessAccount)
        {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }

        if(acc3 instanceof SavingsAccount)
        {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

        System.out.println("-------------------------");
        //POLIMORFISOMO
        System.out.println("Polimorfismo");
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        System.out.println(x.getBalance());
        y.withdraw(50.0);
        System.out.println(y.getBalance());
    }
}
