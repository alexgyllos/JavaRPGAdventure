package characters.fighters;

import characters.Player;
import enemies.Enemy;
import resources.IWeapon;
import weapons.Weapon;

public abstract class Fighter extends Player implements IWeapon {

    private Weapon weapon;

    public Fighter(String name, int hp, Weapon weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Player player) {
        this.weapon.attack(player);
    }
}
