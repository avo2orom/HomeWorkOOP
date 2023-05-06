package HW1;

public class Eggs extends Food{
    public Integer QuantityPerPackage;

    public Eggs(String name, Integer price, Integer quantity, String unitOfMeasure, String expiryDate, Integer quantityPerPackage) {
        super(name, price, quantity, unitOfMeasure, expiryDate);
        this.QuantityPerPackage = quantityPerPackage;
    }

    @Override
    public String toString() {
        return "Eggs{" +
                "QuantityPerPackage=" + QuantityPerPackage +
                ", ExpiryDate='" + ExpiryDate + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", UnitOfMeasure=" + UnitOfMeasure +
                '}';
    }
}
