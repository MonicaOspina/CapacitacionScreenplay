package co.com.capacitation.certification.vivaaerobus.exceptions;

public class ClaseDeVueloNoDisponible extends AssertionError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String message ="Clase de vuelo no disponible";
	
	public static String Clase_N_Diponible() {
		return message;
	}
    public ClaseDeVueloNoDisponible(String message, Throwable cause) {
        super(message, cause);
    }
}