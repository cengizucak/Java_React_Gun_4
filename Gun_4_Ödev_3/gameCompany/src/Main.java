import concrete.CampaingManager;
import concrete.GameManager;
import concrete.PlayerManager;
import entities.Campaing;
import entities.Game;
import entities.Player;

public class Main {
	public static void main(String[] args) {
		
		Player player= new Player(1,"Cengiz","Ucak","28636049682",1973);
		PlayerManager playerManager=new PlayerManager(null);
		playerManager.add(player);
		
		Campaing kampanya= new Campaing(2,"Black Friday",25);
		CampaingManager campaingManager=new CampaingManager();
		campaingManager.add(kampanya);
		
		Game game=new Game(3, "Körebe", 35);
		GameManager gameManager=new GameManager();
		gameManager.toSell(game);
	}

}
