package concrate;

import Entities.Customer;
import abstracts.BaseCustomerManager;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckManager _personCheckManager;

    public StarbucksCustomerManager(CustomerCheckManager personCheckManager) {
        this._personCheckManager = personCheckManager;
    }

    @Override
    public void save(Customer customer) throws Exception {

        if (_personCheckManager.checkIfRealPerson(customer)) {

            super.save(customer);
        } else {

            throw new Exception("Not a valid person");
        }
    }


}
