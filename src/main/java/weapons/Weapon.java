package weapons;

import characters.Player;
import resources.IWeapon;

public abstract class Weapon implements IWeapon {

    private int damageRating;

    public Weapon(int damageRating) {
        this.damageRating = damageRating;
    }

    public int getDamageRating() {
        return damageRating;
    }

    public void attack(Player player) {
        player.getDamaged(this.damageRating);
    }
}
