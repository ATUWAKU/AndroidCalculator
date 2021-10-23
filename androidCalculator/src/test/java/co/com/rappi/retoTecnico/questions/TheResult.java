package co.com.rappi.retoTecnico.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.rappi.retoTecnico.userInterfaces.CalcObjects.RESUL_TEXT;

public class TheResult implements Question<Boolean> {

    private double result;

    public TheResult(double result) {
        this.result = result;
    }

    public static TheResult isEquals(double result){
        return new TheResult(result);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return RESUL_TEXT.resolveFor(actor).getText().equals(result);
    }
}
