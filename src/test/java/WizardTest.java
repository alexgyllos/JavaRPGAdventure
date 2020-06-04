import characters.enemies.Goblin;
import characters.spellcasters.Wizard;
import creatures.Dragon;
import creatures.Golem;
import org.junit.Before;
import org.junit.Test;
import spells.Fireball;
import spells.LightningStrike;
import spells.Spell;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;
    private Fireball fireball;
    private LightningStrike lightningStrike;
    private Goblin goblin;
    private Sword sword;
    private Dragon dragon;
    private Golem golem;

    @Before
    public void setUp() {
        dragon = new Dragon("Parthunax", 30, 20);
        golem = new Golem("Slum", 50, 10);
        sword = new Sword(10);
        fireball = new Fireball(15, 10);
        lightningStrike = new LightningStrike(10, 5);
        wizard = new Wizard("Herald", 10, 30, fireball, dragon);
        goblin = new Goblin("Slicheuqk", 15, sword);
    }

    @Test
    public void hasName() {
        assertEquals("Herald", wizard.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(10, wizard.calculateHp());
    }

    @Test
    public void hasHPAfterDamageButDefended() {
        goblin.attack(wizard);
        assertEquals(10, wizard.calculateHp());
        assertEquals(20, wizard.getCreature().getHp());
    }

    @Test
    public void hasHPAfterDamageButNoCreature() {
        goblin.attack(wizard);
        goblin.attack(wizard);
        goblin.attack(wizard);
        goblin.attack(wizard);
        assertEquals(0, wizard.calculateHp());
        assertEquals(0, wizard.getCreature().getHp());
    }

    @Test
    public void hasMana() {
        assertEquals(30, wizard.getMana());
    }

    @Test
    public void hasManaAfterCastingSpell() {
        wizard.cast(goblin);
        assertEquals(20, wizard.getMana());
    }

    @Test
    public void canRest() {
        wizard.rest();
        assertEquals(40, wizard.getMana());
    }

    @Test
    public void hasSpell() {
        assertEquals(fireball, wizard.getSpell());
    }

    @Test
    public void canChangeSpell() {
        wizard.changeSpell(lightningStrike);
        assertEquals(lightningStrike, wizard.getSpell());
    }

    @Test
    public void canCastSpell() {
        wizard.cast(goblin);
        assertEquals(0, goblin.getHp());
        assertEquals(20, wizard.getMana());
    }

    @Test
    public void hasCreature() {
        assertEquals(dragon, wizard.getCreature());
    }

    @Test
    public void canChangeCreature() {
        wizard.changeCreature(golem);
        assertEquals(golem, wizard.getCreature());
    }
}
