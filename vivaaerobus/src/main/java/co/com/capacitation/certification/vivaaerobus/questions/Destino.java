package co.com.capacitation.certification.vivaaerobus.questions;
import co.com.capacitation.certification.vivaaerobus.userinterfaces.Comparacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


	public class Destino implements Question<String>{

		@Override
		public String answeredBy(Actor actor) {
			return Text.of(Comparacion.TARGET_COMPARATION_1).viewedBy(actor).asString();
			
		}
	
		public static Destino AddedToTheFlight() {
			
			return new Destino();
		}
		
		
	
		
}


