package abstracts;

import entities.Player;

public interface PlayerCheckService {

    public boolean checkIfRealPlayer(Player player) throws Exception;
}
