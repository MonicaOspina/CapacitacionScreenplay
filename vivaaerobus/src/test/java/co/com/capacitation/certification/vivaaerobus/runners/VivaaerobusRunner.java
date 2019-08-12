package co.com.capacitation.certification.vivaaerobus.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/co/com/capacitation/certification/vivaaerobus/features/vivaaerobus.feature",
		glue="co.com.capacitation.certification.vivaaerobus.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		)
public class VivaaerobusRunner {

}
