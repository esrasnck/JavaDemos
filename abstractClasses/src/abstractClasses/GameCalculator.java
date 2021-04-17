package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla() ; // kim implement ediyorsa, hesaplayı override etmek zorunda.
	
	public final void gameOver() {  // sana kimse dokunamaz bebem
		System.out.println("Oyun bitti");
	}
}
