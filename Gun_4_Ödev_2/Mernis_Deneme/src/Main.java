
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		
		KPSPublicSoapProxy cc=new KPSPublicSoapProxy();
		
		boolean sonuc=cc.TCKimlikNoDogrula(Long.parseLong(
				"28636049682"), 
				"Cengiz", 
				"Uçak", 1975);
		
		System.out.println("Aradiginiz kisi : "+(sonuc ? "Basarili ":"Basarisiz"));
		
		
	}

}
