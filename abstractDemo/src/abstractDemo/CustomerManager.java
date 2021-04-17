package abstractDemo;

public class CustomerManager {

	// strategy desing patern
	BaseDatabaseManager databaseManager; // strategy görevini görüyr. kullanırken, hangi veri tabanı sistemini verirsek onu
// onun get datası caliscak
	public void getCustomers() {
		
		databaseManager.getData();
		
	}
}
