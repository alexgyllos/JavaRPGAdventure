import characters.enemies.Goblin;
import creatures.Golem;
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class GolemTest {

    private Golem golem;
    private Goblin goblin;
    private Sword sword;

    @Before
    public void setUp() {
        sword = new Sword(10);
        golem = new Golem("Slum", 50, 10);
        goblin = new Goblin("Slicheuqk", 15, sword);
    }

    @Test
    public void hasName() {
        assertEquals("Slum", golem.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(50, golem.getHp());
    }

    @Test
    public void hasHPAfterDamage() {
        goblin.attack(golem);
        assertEquals(40, golem.getHp());
    }

    @Test
    public void hasDamageRating() {
        assertEquals(10, golem.getDamageRating());
    }

    @Test
    public void canAttack() {
        golem.defend(goblin);
        assertEquals(5, goblin.getHp());
    }
}
