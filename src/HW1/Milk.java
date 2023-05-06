package HW1;

public class Milk extends Drinks {

    public String FatPercentage;
    public String ExpirationDate;

    public Milk(String name, Integer price, Integer quantity, String unitOfMeasure, String volume, String fatPercentage, String expirationDate) {
        super(name, price, quantity, unitOfMeasure, volume);
        this.FatPercentage = fatPercentage;
        this.ExpirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "FatPercentage=" + FatPercentage +
                ", ExpirationDate=" + ExpirationDate +
                ", Volume='" + Volume + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", UnitOfMeasure=" + UnitOfMeasure +
                '}';
    }
}
