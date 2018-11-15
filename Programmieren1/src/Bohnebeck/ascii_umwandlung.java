/**
 * 
 */
package Bohnebeck;

/**
 * @author Ole Jacobsen
 * Umwandlung von einer Integerzahl in seine Bytedarstellung (ASCII-Character).
 */
public class ascii_umwandlung {

	public static void main(String[] args) {
			
			int a = 757935403;			//Deklaration einer Integerzahl
			int b;
		
			while (a>0) {				//Die Eingabe wird in einen String gewandelt in dem die Hex-Werte der Bl�cke stehen
				b=a%256;				/*Um diese Integerzahl in einem Ascii-Character umwandeln zu k�nnen, braucht man immer jeweils 2 vierer Bl�cke
				 						der Bytezahl ,um einen Ascii Wert anzeigen zu k�nnen. Um jetzt auf diese 2er Bl�cke zu kommen, benutzen wir den
				 						 Befehl modulo 256 von der Integerzahl a und bekommen einen 2er Block als Integerzahl ausgegeben.  */
				a=a/256;				// m�ssen wir machen, um die n�chsten 2 vierer Bl�cke zu bekommen
				System.out.print((char)b);		// Ausgabe des Ascii-haracters
			}
			System.out.print(" Programm von Ole Jacobsen");	//Textausgabe vom Ersteller
		}
}
