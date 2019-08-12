package co.com.bancolombia.certification.googlesuite.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.googlesuite.usersinterfaces.GoogleHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task{
	
	private PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	//constructor o setter
	
	@Override
	@Step("{0} opens the browser on Google Home Page")
	public <T extends Actor> void performAs(T actor) {//todas las interacciones en extends
		actor.attemptsTo(Open.browserOn(new GoogleHomePage()));
		
	}

	public static OpenTheBrowser on(PageObject page) {
		
		//return new OpenTheBrowser();
		return instrumented(OpenTheBrowser.class, page);
		//instrumented por debajo llama al constructor de la clase que se ajuste a los parametros
		//return new OpenTheBrowser(page)
	}

}
