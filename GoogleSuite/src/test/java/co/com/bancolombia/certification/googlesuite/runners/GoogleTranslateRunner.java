package co.com.bancolombia.certification.googlesuite.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)//ejecuta el test y genera el informe de serenity
@CucumberOptions(
		features ="src/test/resources/features/google_translate.feature",
		glue="co.com.bancolombia.certification.googlesuite.stepdefinitions",
		snippets = SnippetType.CAMELCASE
)
public class GoogleTranslateRunner {

}
