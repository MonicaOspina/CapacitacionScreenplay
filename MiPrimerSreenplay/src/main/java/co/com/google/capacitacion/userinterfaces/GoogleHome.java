package co.com.google.capacitacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/")

public class GoogleHome extends PageObject{
	
	public static final Target txtBuscar= Target.the("caja de texto").located(By.name("q"));
	

}
