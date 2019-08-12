package co.com.capacitation.certification.vivaaerobus.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;//para no referenciar la clase al llamar al metodo

import org.openqa.selenium.Keys;

import co.com.capacitation.certification.vivaaerobus.userinterfaces.VivaaerobusTheTravelComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;


public class GoTo implements Task {
	
	 private String origen;
	 private String destination;
	 private Target CHIHUAHUA_OPTION;
	 Target ENSAYO;
	 public GoTo(String origen, String destination) {
		
		this.origen=origen;
		this.destination=destination;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
					actor.attemptsTo(Click.on(VivaaerobusTheTravelComponent.DEPARTURE_FLIGHT_OPTION),
					//actor.attemptsTo(Enter.theValue(origen).into(VivaaerobusTheTravelComponent.DEPARTURE_FLIGHT_INPUT));
				
			Click.on(CHIHUAHUA_OPTION = Target.the("chihuahua").locatedBy("//div[@id='flightcriteria-container']//span[@data-bind='text: name.toLowerCase()' and contains(text(),'"+ origen.toLowerCase() +"')] ")));
			
			actor.attemptsTo(Click.on(VivaaerobusTheTravelComponent.BTN_DESTINATION ));
					
					//actor.attemptsTo(Enter.theValue(destination).into(VivaaerobusTheTravelComponent.DESTINATION_FLIGHT_OPTION),
					actor.attemptsTo(Click.on(ENSAYO = Target.the("acapulco").locatedBy("//div[@id='flightcriteria-container']//span[@data-bind='text: $data.name.toLowerCase()' and contains(text(),'"+ destination.toLowerCase() +"')]")));
					actor.attemptsTo(Click.on(VivaaerobusTheTravelComponent.BOX_DATE_INITAL));
			actor.attemptsTo(Click.on(VivaaerobusTheTravelComponent.CHOOSE_INITIAL_DATE),
		Click.on(VivaaerobusTheTravelComponent.BOX_DATE_FINAL),
		Click.on(VivaaerobusTheTravelComponent.CHOOSE_FINAL_DATE),
		Click.on(VivaaerobusTheTravelComponent.SEARCH));
			/*try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
	
				//Enter.theValue("").into(VivaaerobusTheTravelComponent.DEPARTURE_FLIGHT_INPUT).thenHit(Keys.ENTER) 
				//Enter.theValue("").into(VivaaerobusTheTravelComponent.DESTINATION_FLIGHT_OPTION).thenHit(Keys.ENTER)
			
		
		
	}
	
	public static GoTo theTravel(String origen, String destination) {
		
		return instrumented(GoTo.class, origen, destination);
	}
}



	


