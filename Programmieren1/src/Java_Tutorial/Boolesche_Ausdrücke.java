package Java_Tutorial;

public class Boolesche_Ausdrücke {

	public static void main(String[] args) {
		
	}
	
	public static void beispiel() {
		int bargeld = 250;
		int kredit	= 20000;
		
		if( bargeld>200 && kredit>10000) {
			System.out.println("Du hast genügend Geld");
		}

		if(bargeld>200 || kredit>10000)
			System.out.println("Du hast entweder genügend Bargeld oder genügend Kredit");
	}
}
