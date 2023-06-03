package WH7.Warriors;

import WH7.Hero;
import WH7.Weapons.Sword;

public class Swordman extends Hero implements Warrior{

    private Sword sword;

    public Swordman(String name, int damage, int health, Sword sword) {
        super(name, damage, health);
        this.sword = sword;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        if (sword.getName().equals("Sword")){
            this.sword = sword;
        }
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public void attack(Hero target) {
        int targetHealth = target.getHealth() - this.damage;
        target.setHealth(targetHealth);
    }

    @Override
    public void shot(Hero target) {
        int targetHealth = target.getHealth() - this.sword.getDamage();
        target.setHealth(targetHealth);
    }
}
