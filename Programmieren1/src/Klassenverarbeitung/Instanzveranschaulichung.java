package Klassenverarbeitung;

import Methodenveranschaulichung.Circle;

public class Instanzveranschaulichung {

	public static void main(String[] args) {

		Circle_Instanz1 kreis1 = new Circle_Instanz1();/*
														 * kreis1 = Instanz und/oder Referenzvariable
														 * was ist jetzt hier das Objekt???
														 */
		Circle_Instanz1 kreis2 = new Circle_Instanz1();
		Circle_Instanz kreis3 = new Circle_Instanz(2);
		Circle_Instanz kreis4 = new Circle_Instanz(3);

		double flaeche1, flaeche2, flaeche3, flaeche4;

		kreis1.radius = 2;
		kreis2.radius = 3;

		flaeche1 = Circle.fl�che(kreis1.radius);
		flaeche2 = Circle.fl�che(kreis2.radius);
		flaeche3 = Circle_Instanz.fl�che();
		flaeche4 = Circle_Instanz.fl�che();

		System.out.println("Fl�che1: " + flaeche1 + "\nFl�che2: " + flaeche2);
		System.out.println("Fl�che3: " + flaeche3 + "\nFl�che4: " + flaeche4);

	}
}
