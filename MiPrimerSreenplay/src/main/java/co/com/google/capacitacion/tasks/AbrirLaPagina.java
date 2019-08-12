package co.com.google.capacitacion.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLaPagina implements Task {
	
	PageObject page;//atributo
	
	public  AbrirLaPagina(PageObject page) {
		this.page=page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		
	}

	public static Performable en(PageObject page) {//metodo generico para cualquer interfaz
		return Tasks.instrumented(AbrirLaPagina.class, page);
	}

}
