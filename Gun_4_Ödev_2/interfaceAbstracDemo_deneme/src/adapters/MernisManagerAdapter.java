package adapters;

import Entities.Customer;
import abstracts.IPersonCheckManager;

public class MernisManagerAdapter implements IPersonCheckManager {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {


        return true;
    }
}