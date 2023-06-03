package WH7.Warriors;

import WH7.Hero;
import WH7.Weapons.Bow;

public class Archer extends Hero implements Warrior{

    private Bow bow;

    public Archer(String name, int damage, int health, Bow bow) {
        super(name, damage, health);
        this.bow = bow;
    }

    public Bow getBow() {
        return bow;
    }

    public void setBow(Bow bow) {
        if (bow.getName().equals("Bow")){
            this.bow = bow;
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
        int targetHealth = target.getHealth() - this.bow.getDamage();
        target.setHealth(targetHealth);
    }
}
