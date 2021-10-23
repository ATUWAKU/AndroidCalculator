package co.com.rappi.retoTecnico.tasks;

import co.com.rappi.retoTecnico.models.TransactionData;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoBuilder {
    public Performable with(TransactionData data) {
        return instrumented(Do.class, data);
    }
}
