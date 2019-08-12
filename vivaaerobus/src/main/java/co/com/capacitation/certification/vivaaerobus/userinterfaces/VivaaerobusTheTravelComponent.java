package co.com.capacitation.certification.vivaaerobus.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class VivaaerobusTheTravelComponent {
	
	
	public static final Target DEPARTURE_FLIGHT_OPTION = Target.the("box").locatedBy(("//div[@id='box-flight']//div[@class='vb-flight-select vb-flight-select--origin']/input[@type='text'] "));
	public static final Target DEPARTURE_FLIGHT_INPUT = Target.the("The initial travel").locatedBy(("//*[@name='DepartureCity']/preceding-sibling::input"));
	public static final Target CHIHUAHUA_OPTION = Target.the("chihuahua").locatedBy(("//div[@id='flightcriteria-container']/div[2]//span[.='cancún'] "));
	public static final Target SEARCH = Target.the("btn seacrh").located(By.xpath("//a[@id='continueLinkFlight']/span[@class='vi-search-2']"));																							
	public static final Target BTN_DESTINATION = Target.the("box destination").located(By.xpath("//div[@id='box-flight']//div[@class='vb-flight-select vb-flight-select--destination']/input[@type='text']"));
	public static final Target DESTINATION_FLIGHT_OPTION =Target.the("The final travel").locatedBy(("//div[@id='flightcriteria-container']//span[@data-bind='text: $data.name.toLowerCase()' and contains(text(),'acapulco')]"));
	public static final Target BOX_DATE_INITAL = Target.the("The date travel").located(By.id("DepartureDateForDisplay"));
	public static final Target CHOOSE_INITIAL_DATE = Target.the("The initial date").located(By.xpath("//td[contains(@class,'ui-datepicker-week-end')]//a[@class='ui-state-default'][contains(text(),'18')]"));
	public static final Target BOX_DATE_FINAL = Target.the("The final date").located(By.id("ReturnDateForDisplay"));
	public static final Target CHOOSE_FINAL_DATE = Target.the("The final date").located(By.xpath("(//*[@class='ui-datepicker-calendar'])[1]//td[@data-handler='selectDay']/a[contains(text(),'30')]"));

}
                                                                             
																			 