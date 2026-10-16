package model.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
        //Permitir que possa ser instanciado a exceção personalizada passando uma mensagem para ela. Essa mensagem fica salva dentro da 
        //exceção.  
    }

}
