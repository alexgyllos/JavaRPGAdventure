import characters.enemies.Goblin;
import characters.fighters.Barbarian;
import characters.spellcasters.Cleric;
import characters.spellcasters.Wizard;
import creatures.Dragon;
import creatures.Golem;
import party.Party;
import rooms.Quest;
import spells.Fireball;
import spells.Heal;
import spells.LightningStrike;
import treasures.GoldenChest;
import weapons.Sword;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static javax.xml.bind.DatatypeConverter.parseString;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Quest quest = new Quest();
        Sword sword = new Sword(10);
        Barbarian barbarian = new Barbarian("Connan", 20, sword);
        GoldenChest goldenChest = new GoldenChest("Golden Chest", 3000);
        Party party = new Party();
        Goblin goblin = new Goblin("Smeagol", 15, sword);
        Heal heal = new Heal(10, 10);
        Cleric cleric = new Cleric("Healer", 15, 30, heal);
        Dragon dragon = new Dragon("Parthunax", 30, 20);
        Golem golem = new Golem("Slum", 50, 10);
        Fireball fireball = new Fireball(15, 10);
        LightningStrike lightningStrike = new LightningStrike(10, 5);
        Wizard wizard = new Wizard("Herald", 10, 30, fireball, dragon);
        party.addPartyMember(cleric);

        System.out.println("Welcome to Java RPG Adventure");
        System.out.println("Choose one of the following: Barbarian, Wizard");

        String input = scanner.next();
        if (parseString(input) == "Barbarian") {
            party.addPartyMember(barbarian);
        } else {
            party.addPartyMember(wizard);
        }

        System.out.println("Great. You are a " + input + ".");
        System.out.println("Your adventure will begin next time.");
    }
}
