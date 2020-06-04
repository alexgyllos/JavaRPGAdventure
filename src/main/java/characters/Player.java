package characters;

public abstract class Player {

    private String name;
    private int hp;
    private int damage;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.damage = 0;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        int result = hp - damage;
        return result;
    }

    public int getDamage() {
        return damage;
    }

    public void getDamaged(int amountOfDamage) {
        this.damage += amountOfDamage;
    }
}
