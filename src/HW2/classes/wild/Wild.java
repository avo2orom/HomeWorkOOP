package HW2.classes.wild;

import HW2.classes.Animal;

public abstract class Wild extends Animal {
    String habitat;

    String dateFound;

    public Wild(Double height, Double weight, String eyeColor, String habitat, String dateFound) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.dateFound = dateFound;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Wild{" +
                "habitat='" + habitat + '\'' +
                ", dateFound='" + dateFound + '\'' +
                '}';
    }
}
