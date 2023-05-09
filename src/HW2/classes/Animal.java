package HW2.classes;

public abstract class Animal {
    Double height;

    Double weight;

    String eyeColor;

    public abstract void makeSound();

    public Animal(Double height, Double weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
