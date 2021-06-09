package interfaceAbstracDemo;

import Entities.Customer;
import abstracts.BaseCustomerManager;
import concrate.NeroCustomerManager;
import concrate.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) throws Exception {

		Customer customer1 = new Customer(1, "Monica", "Ucak", 1983);
		Customer customer2 = new Customer(2, "Deniz", "Ucak", 2011);
		Customer customer3 = new Customer(3, "Cengiz", "Ucak", 1973);
		BaseCustomerManager manager = new NeroCustomerManager();
		manager.save(customer1);
		System.out.println();
		manager.save(customer2);

		System.out.println();
		manager.save(customer3);
		System.out.println("******");
		manager.save(new Customer(5,"Deniz","UCAK5",2011));

	}
}
