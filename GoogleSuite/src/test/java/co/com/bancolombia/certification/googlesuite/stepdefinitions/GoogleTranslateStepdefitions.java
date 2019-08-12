package co.com.bancolombia.certification.googlesuite.stepdefinitions;

import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import co.com.bancolombia.certification.googlesuite.questions.TheWord;
import co.com.bancolombia.certification.googlesuite.tasks.GoTo;
import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.googlesuite.tasks.Translate;
import co.com.bancolombia.certification.googlesuite.usersinterfaces.GoogleHomePage;
import co.com.bancolombia.certification.googlesuite.usersinterfaces.GoogleappsComponent;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepdefitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor susan = Actor.named("Susan");
	
	private GoogleHomePage googleHomePage;
	
	
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser));
	}

	@Given("^that Susan wants to transalte a word//precondition//precondiciones$")//precondiciones:estar en google translate
	public void thatSusanWantsToTransalteAWordPreconditionPrecondiciones() throws Exception {
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),//susan fue capaz @given, em la otra es con when y es intenta
				GoTo.theApp(GoogleappsComponent.GOOGLE_TRANSLATE));
				
	}


	@When("^she translates the word cheese from English to Spanish//action$")//condiciones: traducir la palabra de ingles a español
	public void sheTranslatesTheWordCheeseFromEnglishToSpanishAction() throws Exception {
	  susan.wasAbleTo(Translate.the());  
	}

	@Then("^she should see the word queso in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() throws Exception {//consecuencias: aparece la palabra traducida-->verificar
	    susan.should(seeThat(TheWord.translated(),equalTo("queso")));
		
	}
}
