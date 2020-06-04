package spells;

import characters.Player;
import resources.IHeal;
import resources.ISpell;

public abstract class Spell implements ISpell, IHeal {

    private int spellDamage;
    private int manaCost;

    public Spell(int spellDamage, int manaCost) {
        this.spellDamage = spellDamage;
        this.manaCost = manaCost;
    }

    public int getSpellDamage() {
        return spellDamage;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void cast(Player player) {
        player.getDamaged(this.spellDamage);
    }

    public void heal(Player player) {
        player.getDamaged(-(this.spellDamage));
    }
}
