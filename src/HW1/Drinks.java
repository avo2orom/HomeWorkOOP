package HW1;

public class Drinks extends Goods{
    public String Volume;

    public Drinks(String name, Integer price, Integer quantity, String unitOfMeasure, String volume) {
        super(name, price, quantity, unitOfMeasure);
        this.Volume = volume;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "Volume='" + Volume + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", UnitOfMeasure=" + UnitOfMeasure +
                '}';
    }
}
