package characters.enemies;

import characters.Player;
import characters.fighters.Fighter;
import enemies.Enemy;
import resources.IWeapon;
import weapons.Weapon;

public class Goblin extends Fighter {

    public Goblin(String name, int hp, Weapon weapon) {
        super(name, hp, weapon);
    }

}
