package entities.secao14HerencaPolimorfismo;

public class PessoaFisica extends Empregado {
    private Double gastoSaude;

    public PessoaFisica()
    {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double calcImposto()
    {
        if(this.getRendaAnual() < 20000)
        {
            if(this.gastoSaude > 0)
            {
                return (this.getRendaAnual() * 0.15 - this.gastoSaude - 0.5) + this.getRendaAnual();
            }
            else
            {
                return (this.getRendaAnual() * 0.15) + this.getRendaAnual();
            }
        }
        else
        {
            if(this.gastoSaude > 0)
            {
                return (this.getRendaAnual() * 0.25 - this.gastoSaude - 0.5) + this.getRendaAnual();
            }
            else
            {
                return (this.getRendaAnual() * 0.25) + this.getRendaAnual();
            }
        }
    }
}
