package rooms;

import characters.Player;
import characters.enemies.Goblin;
import resources.ITreasure;
import treasures.GoldenChest;
import weapons.Sword;

import java.util.ArrayList;
import java.util.Random;

public class Room {

    private Exit exit;
    private ArrayList<Exit> exits;
    private ArrayList<Goblin> enemies;
    private ArrayList<ITreasure> roomTreasure;

    public Room() {
        this.exits = new ArrayList<Exit>();
        this.enemies = new ArrayList<Goblin>();
        this.roomTreasure = new ArrayList<ITreasure>();
        populateExits();
        populateEnemies();
        populateTreasure();
    }

    public ArrayList<Exit> getExits() {
        return exits;
    }

    public void populateExits() {
        Random num = new Random();
        int randomNum = num.nextInt((4 - 1) + 1) + 1;
        for (int var = 0; var < randomNum; var ++) {
            exit = Exit.WEST;
            this.exits.add(exit);
        }
    }

    public void populateEnemies() {
        Random num = new Random();
        int randomNum = num.nextInt((4) + 1);
        for (int var = 0; var < randomNum; var ++) {
            Sword sword = new Sword(10);
            Goblin enemy = new Goblin("Smeagol", 10, sword);
            this.enemies.add(enemy);
        }
    }

    public void populateTreasure() {
        Random num = new Random();
        int randomNum = num.nextInt((1 - 0) + 1) + 0;
        for (int var = 0; var < randomNum; var ++) {
            GoldenChest treasure = new GoldenChest("Golden Chest", 3000);
            this.roomTreasure.add(treasure);
        }
    }

    public ArrayList<Goblin> getEnemies() {
        return enemies;
    }

    public ArrayList<ITreasure> getRoomTreasure() {
        return roomTreasure;
    }
}
