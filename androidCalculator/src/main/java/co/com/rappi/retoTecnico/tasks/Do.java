package co.com.rappi.retoTecnico.tasks;

import co.com.rappi.retoTecnico.interactions.Select;
import co.com.rappi.retoTecnico.models.TransactionData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.rappi.retoTecnico.userInterfaces.CalcObjects.EQUALS_BUTTON;
import static co.com.rappi.retoTecnico.userInterfaces.CalcObjects.NUMBER_BUTTON;

public class Do implements Task {

    private TransactionData data;
    private double firstNumber;
    private String sing;
    private double secondNumber;

    public Do(TransactionData data) {
        firstNumber = data.getFirstNum();
        sing = data.getSign();
        secondNumber = data.getSecondNum();
    }

    public static DoBuilder operations() {
        return new DoBuilder();
    }
    @Step("{0} enter the data for the operation: #firstNumber #sing  #secondNumber")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NUMBER_BUTTON.of(Double.toString(firstNumber))),
                Select.sign(sing),
                Click.on(NUMBER_BUTTON.of(Double.toString(secondNumber))),
                Click.on(EQUALS_BUTTON)
        );
    }
}
