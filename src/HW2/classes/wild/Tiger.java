package HW2.classes.wild;

public class Tiger extends Wild{
    public Tiger(Double height, Double weight, String eyeColor, String habitat, String dateFound) {
        super(height, weight, eyeColor, habitat, dateFound);
    }

    @Override
    public void makeSound() {
        System.out.println("Angry roar");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "habitat='" + habitat + '\'' +
                ", dateFound='" + dateFound + '\'' +
                '}';
    }
}
