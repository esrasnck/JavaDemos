package interfaces;

public class CustomerManager {

	private ICustomerDal _customerDal;
	
	CustomerManager(ICustomerDal customerDal){
		_customerDal = customerDal;
	}
	
	public void add() {
		// is kodları yazilir
		_customerDal.add();
	}
}
