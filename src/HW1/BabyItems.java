package HW1;

public class BabyItems extends Goods {
    public Integer MinimumAge;
    public Boolean Hypoallergeni;

    public BabyItems(String name, Integer price, Integer quantity, String unitOfMeasure, Integer minimumAge, Boolean hypoallergeni) {
        super(name, price, quantity, unitOfMeasure);
        this.MinimumAge = minimumAge;
        this.Hypoallergeni = hypoallergeni;
    }

    @Override
    public String toString() {
        return "BabyItems{" +
                "MinimumAge=" + MinimumAge +
                ", Hypoallergeni=" + Hypoallergeni +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", UnitOfMeasure=" + UnitOfMeasure +
                '}';
    }
}
