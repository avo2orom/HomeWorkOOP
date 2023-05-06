package HW1;

public class Bread extends Food{

    public String TypeOfFlour;

    public Bread(String name, Integer price, Integer quantity, String unitOfMeasure, String expiryDate, String typeOfFlour) {
        super(name, price, quantity, unitOfMeasure, expiryDate);
        this.TypeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "TypeOfFlour='" + TypeOfFlour + '\'' +
                ", ExpiryDate='" + ExpiryDate + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", UnitOfMeasure=" + UnitOfMeasure +
                '}';
    }
}

