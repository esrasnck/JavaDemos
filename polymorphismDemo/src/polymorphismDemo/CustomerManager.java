package polymorphismDemo;


public class CustomerManager {

	private BaseLogger _baseLogger;

	public CustomerManager(BaseLogger baselogger) {
		_baseLogger =baselogger;
	}
	public void add() {
		System.out.println("Musteri eklendi ");
		_baseLogger.log("Log mesaji");
		
	}
}
