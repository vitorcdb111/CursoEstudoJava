package entities.secao14HerencaPolimorfismo;

//quando utilizado a palavra final, evita que a classe seja herdada por outra
public final class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount()
    {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance()
    {
        balance += balance * interestRate;
    }

    //Utilizar o override é uma boa pratica de programacao
    @Override
    //Quando utilizado o final em algum metodo, evita que ele seja sobreposto
    //é uma boa pratica utilizar o "final" em metodos que ja foram sobrepostos, evitando uma inconsistencia multipla
    public final void withdraw(double amount)
    {
        balance -= amount;
    }
}
