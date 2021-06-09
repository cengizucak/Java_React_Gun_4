package mernisAdapter;

import abstracts.PlayerCheckService;
import entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapterManager implements PlayerCheckService {

	@Override
	public boolean checkIfRealPlayer(Player player) throws Exception {
		
		KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),
				player.getName(), player.getLastName(), player.getYearofbirth());
		
	}

}
