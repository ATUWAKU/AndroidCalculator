package co.com.rappi.retoTecnico.questions;

public class ResultException extends AssertionError {

    private static final String MSGERROR = "Resultado Erroneo en la operación";

    public ResultException(){
        super(MSGERROR);
    }
}
