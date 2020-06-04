package spells;

import characters.Player;
import resources.IHeal;
import resources.ISpell;

public class Heal extends Spell {

    public Heal(int spellDamage, int manaCost) {
        super(spellDamage, manaCost);
    }

    public void cast(Player player) {
        player.getDamaged(- this.getSpellDamage());
    }
}
