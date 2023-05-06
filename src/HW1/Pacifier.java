package HW1;

public class Pacifier extends BabyItems{

    public Pacifier(String name, Integer price, Integer quantity, String unitOfMeasure, Integer minimumAge, Boolean hypoallergeni) {
        super(name, price, quantity, unitOfMeasure, minimumAge, hypoallergeni);
    }

    @Override
    public String toString() {
        return "Pacifier{" +
                "MinimumAge=" + MinimumAge +
                ", Hypoallergeni=" + Hypoallergeni +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", UnitOfMeasure=" + UnitOfMeasure +
                '}';
    }
}
