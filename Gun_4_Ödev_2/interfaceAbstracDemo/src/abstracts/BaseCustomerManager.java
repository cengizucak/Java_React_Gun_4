package abstracts;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerManager {
	@Override
	public void save(Customer customer) throws Exception {

		System.out.println("Veritabanina kaydedildi :  " + customer.getId());
		System.out.println("Veritabanina kaydedildi :  " + customer.getFirstName());
		System.out.println("Veritabanina kaydedildi :  " + customer.getLastName());
		System.out.println("Veritabanina kaydedildi :  " + customer.getDateOfBirth());

	}
}
