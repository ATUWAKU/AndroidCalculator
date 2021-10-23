package co.com.rappi.retoTecnico.stepDefinitions;

import co.com.rappi.retoTecnico.models.TransactionData;
import co.com.rappi.retoTecnico.questions.ResultException;
import co.com.rappi.retoTecnico.questions.TheResult;
import co.com.rappi.retoTecnico.tasks.Do;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class basicMathOpStepDefinition {

    Actor actor;

    @Before
    public void config() {
        setTheStage(new OnlineCast());
        actor = new Actor("User Calculator");
    }


    @Given("^the user opens the calculator$")
    public void the_user_opens_the_calculator() {

    }

    @When("^he enter the numbers and the operation$")
    public void he_enter_the_numbers_and_the_operation(TransactionData data) {
        actor.attemptsTo(Do.operations().with(data));
    }

    @Then("^validate that the result is$")
    public void validate_that_the_result_is(TransactionData data) {
        theActorInTheSpotlight().should(seeThat(TheResult.isEquals(data.getResult()))
                .orComplainWith(ResultException.class));

    }
}
