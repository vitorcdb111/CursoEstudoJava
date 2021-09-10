package entities.secao14HerencaPolimorfismo;

public class BusinessAccount  extends Account{

    private double loanLimit;

    public BusinessAccount()
    {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount)
    {
        if(amount <= loanLimit)
        {
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(double amount)
    {
        //Quando é chamado o metodo com a palavra "super", eu utilizo o metodo com a regra da classe original, e depois faco a logica de acordo como precisar
        super.withdraw(amount);
        balance -= 2.0;
    }
}