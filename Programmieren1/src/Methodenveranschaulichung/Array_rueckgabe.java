package Methodenveranschaulichung;

public class Array_rueckgabe {

	// Methode, um ein gew�nschtes zwei dimensionales Array beliebiger Gr��e ausgegeben zu lassen
	// Diese Methode gibt keine Wert zur�ck, weil da void steht, 
	// sondern gibt nur die einzelnen Werte des Array aus
	public static void ausgabeArray2dim(int[][] array){
		for (int i = 0; i < array.length ; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+" ");
			}	
		System.out.println();
		}			
	}
	
	//Methode, um ein Array beliebiger Gr��e mit zuf�lligen Zahlen zu erstellen und zur�ckzugeben
	
	public static int[][] random_Array_Zahlenwerte(int[][] array) {
	
		// Radom Zahlenwerte im Array
		for (int i = 0; i < array.length; i++) {			
			for (int j = 0; j < array[0].length; j++) {				
				array[i][j] = (int) (1+((Math.random()*100)));
			}			
		}			
		return array;
	}
	
	//Methode, um ein Array zu erstellen, welches eine zuf�llige Spalten- und Zeilengr��e
	//zwischen 0 und 10 hat
	
/*	public static int[][] random_Arraygroe�e(int[][] array){
	
		int n = (int) (Math.random()*10);
		int m = (int) (Math.random()*10);
		return array = new int[n][m];
	}
*/	
	public static void main(String[] args) {
		
		int[][] array1 = new int[2][2];			// WARUM?????????
		
//		array1 = random_Arraygroe�e(array1);
		array1 = random_Array_Zahlenwerte(array1);
		ausgabeArray2dim(array1);
	}
}
