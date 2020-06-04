package characters.spellcasters;

import creatures.Creature;
import spells.Spell;

public class Wizard extends Spellcaster {

    private Creature creature;
    private int damage;

    public Wizard(String name, int hp, int mana, Spell spell, Creature creature) {
        super(name, hp, mana, spell);
        this.creature = creature;
        this.damage = 0;

    }

    public Creature getCreature() {
        return creature;
    }

    public void changeCreature(Creature creature) {
        this.creature = creature;
    }

    public void getDamaged(int amountOfDamage) {
        if(this.creature.getHp() > 0) {
            creature.getDamaged(amountOfDamage);
        } else {
            this.damage += amountOfDamage;
        }
    }

    public int calculateHp() {
        int result = getHp() - damage;
        return result;
    }
}
