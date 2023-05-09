package HW2.classes.pets;

public class Dog extends Pet {
    String train;

    public Dog(Double height, Double weight, String eyeColor,
               String nickname, String breed, String vaccinations,
               String color, String dateOfBirth, String train) {
        super(height, weight, eyeColor, nickname, breed, vaccinations, color, dateOfBirth);
        this.train = train;
    }

    @Override
    public void showAffection() {
        System.out.println("i like you SO much!");
    }

    @Override
    public void makeSound() {
        System.out.println("Aw aw aw awawaw");
    }

    public void train(){
        System.out.println("Dog is training now...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", breed='" + breed + '\'' +
                ", vaccinations='" + vaccinations + '\'' +
                ", color='" + color + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public String getTrain() {
        return train;
    }

    private void setTrain(String train) {
        this.train = train;
    }
}
