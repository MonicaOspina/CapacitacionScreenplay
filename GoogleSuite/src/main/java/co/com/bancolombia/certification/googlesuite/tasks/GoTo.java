package co.com.bancolombia.certification.googlesuite.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;//para no referencias directamente al clase al llamar al metodo

import co.com.bancolombia.certification.googlesuite.usersinterfaces.GoogleappsComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoTo implements Task {
	
	private Target googleApp;
	
	public GoTo(Target googleApp){
		this.googleApp= googleApp;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleappsComponent.GOOGLE_APPS),//abre la pagina y va al boton de google
			Click.on(googleApp));//va al boton traductor
				
	}

	public static GoTo theApp(Target googleApp) {
		
		//return new GoTo;//crea instancias
		return instrumented(GoTo.class, googleApp);
	}

}
