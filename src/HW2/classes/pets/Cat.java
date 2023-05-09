package HW2.classes.pets;

public class Cat extends Pet{
    String wool;

    public Cat(Double height, Double weight, String eyeColor, String nickname,
               String breed, String vaccinations, String color,
               String dateOfBirth, String wool) {
        super(height, weight, eyeColor, nickname, breed, vaccinations, color, dateOfBirth);
        this.wool = wool;
    }

    public String getWool() {
        return wool;
    }

    private void setWool(String wool) {
        this.wool = wool;
    }

    @Override
    public void showAffection() {
        System.out.println("I'm so affection! For now....");
    }
    @Override
    public void makeSound(){
        System.out.println("Murrrr");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "wool=" + wool +
                ", nickname='" + nickname + '\'' +
                ", breed='" + breed + '\'' +
                ", vaccinations='" + vaccinations + '\'' +
                ", color='" + color + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
