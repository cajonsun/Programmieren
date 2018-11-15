package Methodenveranschaulichung;

import java.util.Scanner;								//Import der klasse scanner

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);					//Der Scanner wird initialisiert
		System.out.println("Geben Sie ein ob sie ein Kreis oder ein Rechteck haben :");
		String typ = scan.nextLine();							//Der eingelesene Wert ist jetzt als String in "typ" abgespeichert
		
		if (typ.equals ("Kreis")) {
			System.out.println("Geben Sie ein ob sie den Radius ein :");
			int radius = Integer.parseInt(scan.nextLine());		//Eingelesener wert wir zu int konvertiert
			
			System.out.println("Der Umfang ist gleich "+Circle.umfang(radius));		//aufruf der Funktion "Umfang" der klasse "Circle"
			System.out.println("Die Fl�che ist gleich "+Circle.fl�che(radius));
		}
		
		else if (typ.equals("Rechteck")) {
			System.out.println("Geben Sie ein ob sie die Breite ein :");
			int breite = Integer.parseInt(scan.nextLine());
			
			System.out.println("Geben Sie ein ob sie die H�he ein :");
			int h�he = Integer.parseInt(scan.nextLine());
			
			System.out.println("Der Umfang ist gleich "+Rectangle.umfang(h�he, breite));
			System.out.println("Die Fl�che ist gleich "+Rectangle.fl�che(h�he, breite));
			
		}
		scan.close();
	}
}
