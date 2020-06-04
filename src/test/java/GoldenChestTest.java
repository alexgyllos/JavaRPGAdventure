import org.junit.Before;
import org.junit.Test;
import treasures.GoldenChest;

import static org.junit.Assert.assertEquals;

public class GoldenChestTest {

    GoldenChest goldenChest;

    @Before
    public void setUp() {
        goldenChest = new GoldenChest("Golden Chest", 3000);
    }

    @Test
    public void hasName() {
        assertEquals("Golden Chest", goldenChest.getName());
    }

    @Test
    public void hasValue() {
        assertEquals(3000, goldenChest.getValue());
    }
}
