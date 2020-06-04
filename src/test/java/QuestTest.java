import org.junit.Before;
import org.junit.Test;
import rooms.Quest;

import static org.junit.Assert.assertEquals;

public class QuestTest {

    private Quest quest;

    @Before
    public void setUp() {
        quest = new Quest();
    }

    @Test
    public void startsWithRooms() {
        assertEquals(false, quest.getRooms().isEmpty());
    }

    @Test
    public void questHasNotBeenProgressed() {
        assertEquals(false, quest.isCompleted());
    }

    @Test
    public void questHasBeenCompleted() {
        quest.progressQuest();
        quest.progressQuest();
        quest.progressQuest();
        quest.progressQuest();
        quest.progressQuest();
        assertEquals(true, quest.isCompleted());
    }
}
