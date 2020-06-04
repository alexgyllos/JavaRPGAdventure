package creatures;

import characters.Player;
import resources.IDefend;

public abstract class Creature extends Player implements IDefend {

    private int damageRating;


    public Creature(String name, int hp, int damageRating) {
        super(name, hp);
        this.damageRating = damageRating;
    }

    public int getDamageRating() {
        return damageRating;
    }

    public void defend(Player player) {
        player.getDamaged(damageRating);
    }
}
