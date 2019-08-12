package co.com.capacitation.certification.vivaaerobus.utils;

public class Cities {

	

	public static String route_ini(String departure) {
		//Target route_ini = Target.the("inicio ruta").located(By.xpath("//div[@id='availabilityNormal']/div[@class='availabilityContainerWrapper col-lg-10 col-md-9 column-wrapper']/div[1]/div[@class='availability']/div[@class='availabilityOut']//div[@class='col-xs-12']//span[.='"+ departure +"']"));
		return departure;
	}

	public static String route_fin(String destination) {
		//Target route_fin = Target.the("inicio ruta").located(By.xpath("//div[@id='availabilityNormal']/div[@class='availabilityContainerWrapper col-lg-10 col-md-9 column-wrapper']/div[1]/div[@class='availability']/div[@class='availabilityOut']//div[@class='col-xs-12']//span[.='"+ destination +"']"));
		return destination;
	}

}
