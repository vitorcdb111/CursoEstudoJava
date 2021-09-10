package entities.secao14HerencaPolimorfismo;

public abstract class PessoaJuridica extends Empregado {
    private Integer numFuncionario;

    public PessoaJuridica()
    {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionario) {
        super(nome, rendaAnual);
        this.numFuncionario = numFuncionario;
    }

    public Integer getNumFuncionario() {
        return numFuncionario;
    }

    public void setNumFuncionario(Integer numFuncionario) {
        this.numFuncionario = numFuncionario;
    }

    @Override
    public Double calcImposto()
    {
        if(this.getNumFuncionario() >= 10)
        {
            return (this.getRendaAnual() * 0.14) + this.getRendaAnual();
        }
        else
        {
            return (this.getRendaAnual() * 0.16) + this.getRendaAnual();
        }
    }
}
