package concrete;

import abstracts.GameService;
import entities.Game;
import entities.Player;

public class GameManager implements GameService {
    @Override
    public void toSell(Game game ) {

        System.out.println("Oyun satildi : "+game.getName());
    }
}
