package co.com.google.capacitacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BusquedaDePalabra extends PageObject{
	public static final Target resultadoDeLaBusqueda= Target.the("resultado").locatedBy("//h3[contains(text(),'Quesito - Wikipedia, la enciclopedia libre')]");

}
