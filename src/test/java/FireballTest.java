import org.junit.Before;
import org.junit.Test;
import spells.Fireball;

import static org.junit.Assert.assertEquals;

public class FireballTest {

    private Fireball fireball;

    @Before
    public void setUp() {
        fireball = new Fireball(15, 10);
    }

    @Test
    public void hasSpellDamage() {
        assertEquals(15, fireball.getSpellDamage());
    }

    @Test
    public void hasManaCost() {
        assertEquals(10, fireball.getManaCost());
    }
}
