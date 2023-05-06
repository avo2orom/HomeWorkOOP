package HW1;

public class Food extends Goods{
    public String ExpiryDate;

    public Food(String name, Integer price, Integer quantity, String unitOfMeasure, String expiryDate) {
        super(name, price, quantity, unitOfMeasure);
        this.ExpiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Food{" +
                "ExpiryDate='" + ExpiryDate + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", UnitOfMeasure=" + UnitOfMeasure +
                '}';
    }
}
