package co.com.rappi.retoTecnico.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/basicMathOp.feature",
        glue = "co.com.rappi.retoTecnico.stepDefinitions",
        snippets = SnippetType.CAMELCASE)

public class basicMathOp {
}
