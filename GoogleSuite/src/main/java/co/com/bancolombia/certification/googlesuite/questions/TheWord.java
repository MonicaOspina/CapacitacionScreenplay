package co.com.bancolombia.certification.googlesuite.questions;

import co.com.bancolombia.certification.googlesuite.usersinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheWord implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		String word=Text.of(GoogleTranslatePage.TARGET_LANGUAGE_RESULT).viewedBy(actor).asString();
		//StringBuilder sb= new StringBuilder(word);
		//sb.deleteCharAt(5);
		//sb.deleteCharAt(5);
		//sb.deleteCharAt(5);
		
		return word;
	}

	public static TheWord translated() {
		
		return new TheWord();
	}
	
}
