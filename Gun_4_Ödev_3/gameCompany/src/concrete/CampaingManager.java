package concrete;

import abstracts.CampaingService;
import entities.Campaing;

public class CampaingManager implements CampaingService {
    @Override
    public void add(Campaing campaing) {
        System.out.println("Kampanya eklendi : "+campaing.getCampaignName());

    }

    @Override
    public void update(Campaing campaing) {
        System.out.println("Kampanya guncellendi : "+campaing.getCampaignName());

    }

    @Override
    public void delete(Campaing campaing) {
        System.out.println("Kampanya silindi : "+campaing.getCampaignName());

    }
}
