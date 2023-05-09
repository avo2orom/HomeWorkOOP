package HW2.classes.wild;

public class Wolf extends Wild {
    String leaderOfThePack;

    public Wolf(Double height, Double weight, String eyeColor, String habitat, String dateFound, String leaderOfThePack) {
        super(height, weight, eyeColor, habitat, dateFound);
        this.leaderOfThePack = leaderOfThePack;
    }

    public String isLeaderOfThePack() {
        return leaderOfThePack;
    }

    private void setLeaderOfThePack(String leaderOfThePack) {
        this.leaderOfThePack = leaderOfThePack;
    }

    @Override
    public void makeSound() {
        System.out.println("Aoyyyyyyyyyyyyyyyyyyyy");
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "leaderOfThePack=" + leaderOfThePack +
                '}';
    }
}
