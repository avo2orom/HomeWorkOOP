package HW2.classes.birds;

import HW2.classes.Animal;
import HW2.interfaces.fly;

public abstract class Bird extends Animal implements fly {
    Integer flightAltitude;

    public Bird(Double height, Double weight, String eyeColor, Integer flightAltitude) {
        super(height, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }

    public Integer getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(Integer flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public abstract void makeSound();

    @Override
    public void fly() {
        System.out.println("Я лечу на " + getFlightAltitude() +" метрах");
    }
}
