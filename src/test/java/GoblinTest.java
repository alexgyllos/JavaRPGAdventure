import characters.enemies.Goblin;
import characters.fighters.Barbarian;
import org.junit.Before;
import org.junit.Test;
import resources.IWeapon;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class GoblinTest {

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
        assertEquals("Slicheuqk", goblin.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(15, goblin.getHp());
    }

    @Test
    public void hasHPAfterDamage() {
        barbarian.attack(goblin);
        assertEquals(5, goblin.getHp());
    }

    @Test
    public void canAttack() {
        goblin.attack(barbarian);
        assertEquals(10, barbarian.getHp());
    }

    @Test
    public void canChangeWeapon() {
        goblin.changeWeapon(axe);
        assertEquals(axe, goblin.getWeapon());
    }

    @Test
    public void startsWithNoDamage() {
        assertEquals(0, goblin.getDamage());
    }
}
