package HW2.classes.pets;

import HW2.classes.Animal;

public abstract class Pet extends Animal {
    String nickname;
    String breed;
    String vaccinations;
    String color;
    String dateOfBirth;

    public Pet(Double height, Double weight, String eyeColor, String nickname, String breed, String vaccinations, String color, String dateOfBirth) {
        super(height, weight, eyeColor);
        this.nickname = nickname;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.color = color;
        this.dateOfBirth = dateOfBirth;
    }

    public abstract void showAffection();

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Pet{" +
                "nickname='" + nickname + '\'' +
                ", breed='" + breed + '\'' +
                ", vaccinations='" + vaccinations + '\'' +
                ", color=" + color +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
