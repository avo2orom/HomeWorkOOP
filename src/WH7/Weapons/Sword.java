package WH7.Weapons;

import WH7.Weapon;

public class Sword extends Weapon {
    public Sword(String name, int damage, int minLevel) {
        super(name, damage, minLevel);
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public int getMinLevel() {
        return super.getMinLevel();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
