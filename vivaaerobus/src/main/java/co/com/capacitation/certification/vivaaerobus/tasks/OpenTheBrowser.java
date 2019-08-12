package co.com.capacitation.certification.vivaaerobus.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.capacitation.certification.vivaaerobus.userinterfaces.VivaaerobusHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {

	static PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	@Override
	@Step("{0} opens the browser vivaaerobus")
	public <T extends Actor> void performAs(T actor) {//van todas las interraciones para relaizar la tarea
		actor.attemptsTo(Open.browserOn(new VivaaerobusHomePage()));
		
	}
	
	/*public static OpenTheBrowser on() {
		return instrumented(OpenTheBrowser.class);
	}*/

	public static OpenTheBrowser on(VivaaerobusHomePage vivaaerobusHomePage) {
		return instrumented(OpenTheBrowser.class, page);
		
	}

	
}
