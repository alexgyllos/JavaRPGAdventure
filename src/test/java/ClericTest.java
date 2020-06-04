import characters.enemies.Goblin;
import characters.spellcasters.Cleric;
import org.junit.Before;
import org.junit.Test;
import spells.Heal;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Goblin goblin;
    private Sword sword;
    private Cleric cleric;
    private Heal heal;

    @Before
    public void setUp() {
        sword = new Sword(10);
        goblin = new Goblin("Slicheuqk", 15, sword);
        heal = new Heal(10, 10);
        cleric = new Cleric("Healer", 15, 30, heal);
    }

    @Test
    public void hasName() {
        assertEquals("Healer", cleric.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(15, cleric.getHp());
    }

    @Test
    public void hasHPAfterDamage() {
        goblin.attack(cleric);
        assertEquals(5, cleric.getHp());
    }

    @Test
    public void hasHPAfterHeal() {
        goblin.attack(cleric);
        cleric.cast(cleric);
        assertEquals(15, cleric.getHp());
    }

    @Test
    public void hasMana() {
        assertEquals(30, cleric.getMana());
    }

    @Test
    public void hasManaAfterSpell() {
        cleric.cast(cleric);
        assertEquals(20, cleric.getMana());
    }

    @Test
    public void hasSpell() {
        assertEquals(heal, cleric.getSpell());
    }
}
