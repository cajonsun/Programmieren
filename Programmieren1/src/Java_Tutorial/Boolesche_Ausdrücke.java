package Java_Tutorial;

public class Boolesche_Ausdr�cke {

	public static void main(String[] args) {
		
	}
	
	public static void beispiel() {
		int bargeld = 250;
		int kredit	= 20000;
		
		if( bargeld>200 && kredit>10000) {
			System.out.println("Du hast gen�gend Geld");
		}

		if(bargeld>200 || kredit>10000)
			System.out.println("Du hast entweder gen�gend Bargeld oder gen�gend Kredit");
	}
}
