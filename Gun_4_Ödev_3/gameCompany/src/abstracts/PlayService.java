package abstracts;

import entities.Player;

public interface PlayService {
    void add(Player player);
    void update(Player player);
    void delete(Player player);
}
