package entities.secao15Excecoes;

import entities.secao15Excecoes.exceptions.Exercise2Exception;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account()
    {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount)
    {
        this.balance += amount;
    }

    public void withdraw(Double amount) throws Exercise2Exception
    {
        validateWithdraw(amount);
        this.balance -= amount;
    }

    public void validateWithdraw(double amount) throws Exercise2Exception
    {
        if(balance <= 0)
        {
            throw new Exercise2Exception("Não há saldo na conta.");
        }
        if(amount > getWithdrawLimit())
        {
            throw new Exercise2Exception("Valor maior que o limite.");
        }
        if(amount > getBalance())
        {
            throw new Exercise2Exception("Saldo insuficiente.");
        }
    }
}
