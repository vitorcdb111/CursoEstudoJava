package entities.secao15Excecoes.exceptions;

public class DomainException extends Exception{
    //RuntimeException - O compilador n te obriga a tratar
    //Exception - O compilador te obriga a tratar

    //a classe exception é do tipo serializable e precisa ter uma versao
    private static final long serialVersionUID = 1L;

    //Permitir que possa instanciar a excessao personalizada passando uma mensagem
    public DomainException(String msg)
    {
        super(msg);
    }
}
