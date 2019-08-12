package co.com.capacitation.certification.vivaaerobus.tasks;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class VentanaEmergente implements Task{
	
	private Set<String> toppings;
	private String[] arrayOfString;
	WebDriver herBrowser;
	
	 public VentanaEmergente(WebDriver herBrowser) {
			// TODO Auto-generated constructor stub
			this.herBrowser=herBrowser;
		}
	 
	@Override
	public <T extends Actor> void performAs(T actor) {
		//Para resolver la ventana emergente	
		toppings = new HashSet<>(( herBrowser.getWindowHandles()));
	    arrayOfString = toppings .toArray(new String[0]);
	   	herBrowser.switchTo().window(arrayOfString[0].toString()); //quita la principal pestaña
		//herBrowser.close();
		herBrowser.switchTo().window(arrayOfString[1].toString());//deja la segunda pestaña
		
	}

	public static VentanaEmergente Control(WebDriver herBrowser) {
		
		return Tasks.instrumented(VentanaEmergente.class, herBrowser);
	}
	
	
}
