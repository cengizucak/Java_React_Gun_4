package adapters;

import Entities.Customer;
import abstracts.IPersonCheckManager;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManagerAdapter implements IPersonCheckManager {
	@Override
	public boolean checkIfRealPerson(Customer customer) throws Exception {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		boolean result = true;

		try {

			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(),
					customer.getLastName(), customer.getDateOfBirth());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}