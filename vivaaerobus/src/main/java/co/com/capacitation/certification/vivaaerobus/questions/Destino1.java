package co.com.capacitation.certification.vivaaerobus.questions;

import co.com.capacitation.certification.vivaaerobus.userinterfaces.Comparacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Destino1 implements Question<String>{
	
	@Override
	public String answeredBy(Actor actor) {
		
		
		return  Text.of(Comparacion.TARGET_COMPARATION_2).viewedBy(actor).asString();
		 	 
	}

	public static Destino1 AddedToTheFlight() {
		
		return new Destino1();
	}
}
