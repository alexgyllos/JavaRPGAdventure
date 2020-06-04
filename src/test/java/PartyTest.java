import characters.enemies.Goblin;
import characters.fighters.Barbarian;
import characters.spellcasters.Cleric;
import org.junit.Before;
import org.junit.Test;
import party.Party;
import spells.Heal;
import treasures.GoldenChest;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class PartyTest {

    private Party party;
    private GoldenChest goldenChest;
    private Sword sword;
    private Barbarian barbarian;
    private Goblin goblin;
    private Heal heal;
    private Cleric cleric;

    @Before
    public void setUp() {
        sword = new Sword(10);
        barbarian = new Barbarian("Connan", 20, sword);
        goldenChest = new GoldenChest("Golden Chest", 3000);
        party = new Party();
        goblin = new Goblin("Smeagol", 15, sword);
        heal = new Heal(10, 10);
        cleric = new Cleric("Healer", 15, 30, heal);
    }

    @Test
    public void partyStartsEmpty() {
        assertEquals(0, party.getParty().size());
    }

    @Test
    public void partyTreasureStartsEmpty() {
        assertEquals(0, party.getPartyTreasure().size());
    }

    @Test
    public void canAddPartyMember() {
        party.addPartyMember(barbarian);
        assertEquals(1, party.getParty().size());
    }

    @Test
    public void canAddTreasure() {
        party.addTreasure(goldenChest);
        assertEquals(1, party.getPartyTreasure().size());
        assertEquals(3000, party.getValue());
    }

    @Test
    public void partyCanTakeAction() {
        party.addPartyMember(barbarian);
        party.addPartyMember(cleric);
        party.partyAction(goblin, barbarian);
        assertEquals(5, goblin.getHp());
        assertEquals(30, barbarian.getHp());
        assertEquals(20, cleric.getMana());
    }
}
