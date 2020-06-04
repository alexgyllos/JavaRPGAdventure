package treasures;

import resources.ITreasure;

public class Treasure implements ITreasure {

    private String name;
    private int value;

    public Treasure(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return this.value;
    }
}
