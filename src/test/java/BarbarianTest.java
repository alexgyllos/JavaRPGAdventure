import characters.enemies.Goblin;
import characters.fighters.Barbarian;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Goblin goblin;
    private Sword sword;
    private Axe axe;

    @Before
    public void setUp() {
        axe = new Axe(15);
        sword = new Sword(10);
        barbarian = new Barbarian("Connan", 20, sword);
        goblin = new Goblin("Slicheuqk", 15, sword);
    }

    @Test
    public void hasName() {
        assertEquals("Connan", barbarian.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(20, barbarian.getHp());
    }

    @Test
    public void hasHPAfterDamage() {
        goblin.attack(barbarian);
        assertEquals(10, barbarian.getHp());
    }

    @Test
    public void canAttack() {
        barbarian.attack(goblin);
        assertEquals(5, goblin.getHp());
    }

    @Test
    public void canChangeWeapon() {
        barbarian.changeWeapon(axe);
        assertEquals(axe, barbarian.getWeapon());
    }
}
