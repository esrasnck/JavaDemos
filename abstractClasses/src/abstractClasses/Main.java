package abstractClasses;  // base i gizlemek istediiniz zaman da kullanılır. new'lenemez. newlenebilmesi için,
						// onun operasyonlarını implement etmemiz gerek.

public class Main {

	public static void main(String[] args) {

		
		WomanGameCalculator wMcalculator = new WomanGameCalculator();
		wMcalculator.hesapla();
		wMcalculator.gameOver();
		
		GameCalculator gameCalculator = new KidsGameCalculator(); // referans tutar. interface gibi		
	}

}
