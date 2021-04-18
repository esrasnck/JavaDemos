package classArray;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Customer engin = new Customer(4,"Engin2","Demirog");
		customers.add(engin);
		customers.add(new Customer(1,"Engin","Demirog"));
		customers.add(new Customer(2,"Derin","Demirog"));
		customers.add(new Customer(3,"Esra","Sancak"));
		
		customers.remove(engin);
		
		customers.remove(new Customer(1,"Engin","Demirog")); // yeniden üretip - siliyor
		for(Customer customer:customers) {
			System.out.println(customer.firstName);
		}

	}

}
