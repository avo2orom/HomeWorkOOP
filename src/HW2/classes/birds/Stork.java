package HW2.classes.birds;

public class Stork extends Bird{

    public Stork(Double height, Double weight, String eyeColor, Integer flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    @Override
    public String toString() {
        return "Stork{" +
                "flightAltitude=" + flightAltitude +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("A a a a a ");
    }
}
