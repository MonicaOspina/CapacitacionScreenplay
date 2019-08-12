package co.com.google.capacitacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)//clase que interpreta todos los pasos que hacemos
@CucumberOptions(features="src\\test\\resources\\co\\"
		+ "com\\google\\capacitacion\\features\\BuscarGoogle.feature", 
		glue="co.com.google.capacitacion.stepdefinitions",
		snippets=SnippetType.CAMELCASE)

public class buscarGoogleRunner {
	
}
