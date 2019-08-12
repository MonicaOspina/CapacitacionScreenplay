package co.com.google.capacitacion.tasks;

import org.openqa.selenium.Keys;

import co.com.google.capacitacion.userinterfaces.GoogleHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class Buscar implements Task {

	private String palabraBuscar;
	
	public Buscar(String palabraBuscar) {
		this.palabraBuscar=palabraBuscar;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(palabraBuscar).into(GoogleHome.txtBuscar).thenHit(Keys.ENTER));		
	}

	public static Buscar palabra(String palabraBuscar) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Buscar.class, palabraBuscar);
	}

}
