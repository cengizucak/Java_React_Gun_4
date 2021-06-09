package concrete;

import abstracts.PlayService;
import abstracts.PlayerCheckService;
import entities.Player;

public class PlayerManager implements PlayService {
	
	private PlayerCheckService playerCheckService;
	
    public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
    public void add(Player player) {
		 System.out.println("Oyucu eklendi : " + player.getName());
       
}

    @Override
    public void update(Player player) {
        System.out.println("Oyucu guncellendi : " + player.getName());

    }

    @Override
    public void delete(Player player) {
        System.out.println("Oyucu silindi : " + player.getName());

    }
}
