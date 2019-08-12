package co.com.bancolombia.certification.googlesuite.usersinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	
	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source language button").locatedBy("//div[@class='sl-more tlid-open-source-language-list']"); 
	public static final Target TARGET_LANGUAGE_OPTION = Target.the("Target language button").locatedBy("//div[@class='tl-more tlid-open-target-language-list']");
	public static final Target SOURCE_LANGUAGE = Target.the("Source language").locatedBy("//div[@class='language_list_item_icon sl_list_en_checkmark']");
	public static final Target TARGET_LANGUAGE = Target.the("Target language").locatedBy(("//div[@class='language_list_item_icon tl_list_es_checkmark']"));
	public static final Target SOURCE_LANGUAGE_TEXTAREA = Target.the("Source language textarea").located(By.id("source"));
	public static final Target TARGET_LANGUAGE_RESULT = Target.the("Target language result area").locatedBy("//span[@class='tlid-translation translation']");

	
}
