package co.com.google.capacitacion.questions;


import co.com.google.capacitacion.userinterfaces.BusquedaDePalabra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Resultado implements Question<String>{

	public static Resultado busqueda() {
		
		return new Resultado();
	}

	@Override
	public String answeredBy(Actor actor) {
		String word=Text.of(BusquedaDePalabra.resultadoDeLaBusqueda).viewedBy(actor).asString();
		StringBuilder sb= new StringBuilder(word);
		System.out.println(word);
		return sb.toString();
	
	}

}
