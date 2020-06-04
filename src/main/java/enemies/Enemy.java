package enemies;

public abstract class Enemy {

    private int hp;
    private int damage;

    public Enemy(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public int getHp() {
        return hp -= damage;
    }

    public int getDamage() {
        return damage;
    }

    public void getDamaged(int damage) {
        this.damage += damage;
    }
}
