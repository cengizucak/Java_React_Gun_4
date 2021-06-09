package concrate;

import Entities.Customer;
import abstracts.IPersonCheckManager;


public class CustomerCheckManager implements IPersonCheckManager {


    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        return true;
    }
}
