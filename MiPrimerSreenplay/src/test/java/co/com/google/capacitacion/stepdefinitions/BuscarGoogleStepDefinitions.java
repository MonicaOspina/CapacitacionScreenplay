package co.com.google.capacitacion.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;


import co.com.google.capacitacion.questions.Resultado;
import co.com.google.capacitacion.tasks.AbrirLaPagina;
import co.com.google.capacitacion.tasks.Buscar;
import co.com.google.capacitacion.userinterfaces.GoogleHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BuscarGoogleStepDefinitions {
	
	@Managed(driver="chrome")//
	WebDriver suNavegador;      //creamos el driver
	
	Actor monica=Actor.named("Monica");
	
	GoogleHome googleHome;//objeto creado de la clase
	@Before
	public void setUp() {
		monica.can(BrowseTheWeb.with(suNavegador));
	}

	    
	@Given("^que Monica esta en la pagina de google$")
	public void queMonicaEstaEnLaPaginaDeGoogle() throws Exception {
	    monica.wasAbleTo(AbrirLaPagina.en(googleHome)); //en minuscula porque crea un objeto
	}


	@When("^busca la palabra \"([^\"]*)\"$")
	public void buscaLaPalabra(String arg1) throws Exception {
	    monica.attemptsTo(Buscar.palabra(arg1));
	}

	@Then("^deberia ver el resultado de wikipedia$")
	public void deberiaVerElResultadoDeWikipedia() throws Exception {
	   monica.should(seeThat(Resultado.busqueda(), equalTo("Quesito - Wikipedia, la enciclopedia libre")));
	}	 
	
}
