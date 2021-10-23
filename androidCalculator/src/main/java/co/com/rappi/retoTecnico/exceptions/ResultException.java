package co.com.rappi.retoTecnico.exceptions;

public class ResultException extends AssertionError {

    public ResultException(){
        super("El resultado no es correcto");
    }

    public ResultException(String message, Throwable cause){

        super(message, cause);

    }
}
