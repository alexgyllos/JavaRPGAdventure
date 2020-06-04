import org.junit.Before;
import org.junit.Test;
import rooms.Exit;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void setUp() {
        room = new Room();
    }

    @Test
    public void roomStartsWithExits() {
        assertEquals( false, room.getExits().isEmpty());
    }

    @Test
    public void firstExitValue() {
        assertEquals( "West",room.getExits().get(0).getExitValue());
    }

    @Test
    public void roomStartsWithEnemies() {
        assertEquals(false, room.getEnemies().isEmpty());
    }

    @Test
    public void roomStartsWithTreasure() {
        assertEquals(false, room.getRoomTreasure().isEmpty());
    }
}
