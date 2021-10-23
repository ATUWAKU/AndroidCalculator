package co.com.rappi.retoTecnico.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.rappi.retoTecnico.userInterfaces.CalcObjects.RESUL_TEXT;

public class TheResult implements Question <Boolean> {

    private int result;

    public TheResult(int result) {
        this.result = result;
    }

    public static TheResult isEquals(int result){
        return new TheResult(result);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return  Integer.parseInt(RESUL_TEXT.resolveFor(actor).getText()) == result;
    }
}
