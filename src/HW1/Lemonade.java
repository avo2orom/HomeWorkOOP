package HW1;

public class Lemonade extends Drinks{

    public Lemonade(String name, Integer price, Integer quantity, String unitOfMeasure, String volume) {
        super(name, price, quantity, unitOfMeasure, volume);
    }

    @Override
    public String toString() {
        return "Lemonade{" +
                "Volume='" + Volume + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", UnitOfMeasure=" + UnitOfMeasure +
                '}';
    }
}
