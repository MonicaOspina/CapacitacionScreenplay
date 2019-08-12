package co.com.capacitation.certification.vivaaerobus.stepdefinitions;

import static co.com.capacitation.certification.vivaaerobus.exceptions.ClaseDeVueloNoDisponible.Clase_N_Diponible;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.com.capacitation.certification.vivaaerobus.exceptions.ClaseDeVueloNoDisponible;
import co.com.capacitation.certification.vivaaerobus.questions.Destino;
import co.com.capacitation.certification.vivaaerobus.questions.Destino1;
import co.com.capacitation.certification.vivaaerobus.tasks.GoTo;
import co.com.capacitation.certification.vivaaerobus.tasks.OpenTheBrowser;
import co.com.capacitation.certification.vivaaerobus.tasks.VentanaEmergente;
import co.com.capacitation.certification.vivaaerobus.userinterfaces.VivaaerobusHomePage;
import co.com.capacitation.certification.vivaaerobus.utils.Cities;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class VivaaerobusStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor moni = Actor.named("Moni");
	
	private VivaaerobusHomePage vivaaerobusHomePage;
	
	@Before
	public void setUp() {
		moni.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that Monica want to visit the page vivaaerobus$")
	public void thatMonicaWantToVisitThePageVivaaerobus() throws Exception {
	    moni.wasAbleTo(OpenTheBrowser.on(vivaaerobusHomePage));
	 
	}

	@When("^she chooses a flight using vivaaerobus\\. Departure:\"([^\"]*)\" and destination:\"([^\"]*)\"$")
	public void sheChoosesAFlightUsingVivaaerobusDepartureAndDestination(String origen, String destination) throws Exception  {
		moni.wasAbleTo(GoTo.theTravel(origen, destination));
		moni.wasAbleTo(VentanaEmergente.Control(herBrowser));
	    
	}
	
	@Then("^she compares  the flight in the screen Departure:\"([^\"]*)\" and destination:\"([^\"]*)\"$")
	public void sheComparesTheFlightInTheScreenDepartureAndDestination(String Departure, String destination) throws Exception {
		moni.should(seeThat(Destino.AddedToTheFlight(), equalTo(Cities.route_ini(Departure))).orComplainWith(ClaseDeVueloNoDisponible.class, Clase_N_Diponible()));
	    moni.should(seeThat(Destino1.AddedToTheFlight(), equalTo(Cities.route_fin(destination))).orComplainWith(ClaseDeVueloNoDisponible.class, Clase_N_Diponible()));
	}
}




