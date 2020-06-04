package characters.spellcasters;

import characters.Player;
import creatures.Creature;
import resources.ISpell;
import spells.Spell;

public abstract class Spellcaster extends Player implements ISpell {

    private int mana;
    private Spell spell;

    public Spellcaster(String name, int hp, int mana, Spell spell) {
        super(name, hp);
        this.mana = mana;
        this.spell = spell;

    }

    public int getMana() {
        return mana;
    }

    public void rest() {
        this.mana += 10;
    }

    public Spell getSpell() {
        return spell;
    }

    public void changeSpell(Spell spell) {
        this.spell = spell;
    }

    public void cast(Player player) {
        this.spell.cast(player);
        this.mana -= this.spell.getManaCost();
    }
}
