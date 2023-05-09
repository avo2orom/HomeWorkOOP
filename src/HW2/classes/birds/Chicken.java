package HW2.classes.birds;

public class Chicken extends Bird{
    public Chicken(Double height, Double weight, String eyeColor, Integer flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "flightAltitude=" + flightAltitude +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Kokokoko");
    }
}
