package co.com.rappi.retoTecnico.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.rappi.retoTecnico.userInterfaces.CalcObjects.*;
import static co.com.rappi.retoTecnico.utils.Operations.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Select implements Interaction {

    private String sing;

    public Select(String sing) {
        this.sing = sing;
    }

    public static Performable sign(String sign) {

        return instrumented(Select.class, sign);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (sing){
            case SUM_OP:
                actor.attemptsTo(
                        Click.on(SUM_BUTTON)
                );
                break;
            case SUBTRACTION_OP:
                actor.attemptsTo(
                        Click.on(SUBTRACT_BUTTON)
                );
                break;
            case MULTIPLICATION_OP:
                actor.attemptsTo(
                        Click.on(MULTI_BUTTON)
                );
                break;
            case DIVISION_OP:
                actor.attemptsTo(
                        Click.on(DIVISION_BUTTON)
                );
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sing);
        }
    }
}
