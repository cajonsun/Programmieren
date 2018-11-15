package Methodenveranschaulichung;

import java.util.Scanner;



public class Calculator_alles_in_einem {
	
	public static double fl�che (int radius) {
		double a= Math.PI* Math.pow(radius, 2);		//Verwenden der mathe funktion pi und der funktion (x hoch y)
		return a;									//R�ckgabe des Wertes a f�r die Funktion "fl�che"
	}
	public static double umfang (int radius) {
		double u= Math.PI *radius*2;
		return u;
	}
	
	public static int fl�che (int h�he, int breite) {
		int a = h�he*breite;
		return a;
	}
	
	public static double umfang (int h�he, int breite) {
		double u = 2*h�he + 2*breite;
		return u;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);					//Der Scanner wird initialisiert
		System.out.println("Geben Sie ein ob sie ein Kreis oder ein Rechteck haben :");
		String typ = scan.nextLine();							//Der eingelesene Wert ist jetzt als String in "typ" abgespeichert
		
		if (typ.equals ("Kreis")) {
			System.out.println("Geben Sie ein ob sie den Radius ein :");
			int radius = Integer.parseInt(scan.nextLine());		//Eingelesener wert wir zu int konvertiert
			
			System.out.println("Der Umfang ist gleich "+umfang(radius));		//aufruf der Funktion "Umfang" der klasse "Circle"
			System.out.println("Die Fl�che ist gleich "+fl�che(radius));
		}
		
		else if (typ.equals("Rechteck")) {
			System.out.println("Geben Sie ein ob sie die Breite ein :");
			int b = Integer.parseInt(scan.nextLine());
			
			System.out.println("Geben Sie ein ob sie die H�he ein :");
			int h = Integer.parseInt(scan.nextLine());
			
			System.out.println("Der Umfang ist gleich "+umfang(h, b));
			System.out.println("Die Fl�che ist gleich "+fl�che(h, b));
		}
		scan.close();
	}

}
