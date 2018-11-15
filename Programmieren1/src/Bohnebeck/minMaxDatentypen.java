/**
 * 
 */
package Bohnebeck;

/**
 * @author Ole Jacobsen
 * Ausgabe der Wertebereiche der einzelnen primitiven Datentypen.
 */
public class minMaxDatentypen {
	
	public static void main(String[] args) {
	
		//Ausgabe des Wertebereichs des Datentyps byte		
		System.out.print ("Der Wertebereich des Datentyps byte geht von: ");	
		System.out.println (Byte.MIN_VALUE+ " bis "+Byte.MAX_VALUE);	

		//Ausgabe des Wertebereichs des Datentyps short		
		System.out.print ("Der Wertebereich des Datentyps short geht von: ");
		System.out.println (Short.MIN_VALUE+" bis "+Short.MAX_VALUE);

		//Ausgabe des Wertebereichs des Datentyps Integer		
		System.out.print ("Der Wertebereich des Datentyps int geht von: ");
		System.out.println (Integer.MIN_VALUE+" bis "+Integer.MAX_VALUE);

		//Ausgabe des Wertebereichs des Datentyps long		
		System.out.print ("Der Wertebereich des Datentyps long geht von: ");
		System.out.println (Long.MIN_VALUE+" bis "+Long.MAX_VALUE);

		//Ausgabe des Wertebereichs des Datentyps float
		System.out.print ("Der Wertebereich des Datentyps float geht von: ");
		System.out.println (Float.MIN_VALUE+" bis "+Float.MAX_VALUE);

		//Ausgabe des Wertebereichs des Datentyps double
		System.out.print ("Der Wertebereich des Datentyps double geht von: ");
		System.out.println (Double.MIN_VALUE+" bis "+Double.MAX_VALUE);
	}
}
