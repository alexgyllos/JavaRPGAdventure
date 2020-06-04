package party;

import characters.Player;
import characters.fighters.Fighter;
import characters.spellcasters.Cleric;
import characters.spellcasters.Spellcaster;
import resources.ITreasure;

import java.util.ArrayList;

public class Party {

    private ArrayList<Player> party;
    private ArrayList<ITreasure> partyTreasure;

    public Party() {
        this.party = new ArrayList<Player>();
        this.partyTreasure = new ArrayList<ITreasure>();
    }

    public ArrayList<Player> getParty() {
        return party;
    }

    public void addPartyMember(Player player) {
        this.party.add(player);
    }

    public ArrayList<ITreasure> getPartyTreasure() {
        return partyTreasure;
    }

    public void addTreasure(ITreasure treasure) {
        this.partyTreasure.add(treasure);
    }

    public int getValue() {
        int totalTreasureValue = 0;
        for (ITreasure treasure: partyTreasure) {
            totalTreasureValue += treasure.getValue();
        }
        return totalTreasureValue;
    }

    public void partyAction(Player enemy, Player partyMember) {
        for (Player player : party) {
            if (player instanceof Fighter) {
                ((Fighter) player).attack(enemy);
            } else if (player instanceof Cleric) {
                ((Cleric) player).cast(partyMember);
            } else if (player instanceof Spellcaster) {
                ((Spellcaster) player).cast(enemy);
            }
        }
    }

}
