package HW1;

public class Diapers extends BabyItems{
    public Integer Size;
    public Integer MinimumWeight;
    public Integer MaximumWeight;
    public String Type;

    public Diapers(String name, Integer price, Integer quantity, String unitOfMeasure, Integer minimumAge, Boolean hypoallergeni, Integer size, Integer minimumWeight, Integer maximumWeight, String type) {
        super(name, price, quantity, unitOfMeasure, minimumAge, hypoallergeni);
        this.Size = size;
        this.MinimumWeight = minimumWeight;
        this.MaximumWeight = maximumWeight;
        this.Type = type;
    }

    @Override
    public String toString() {
        return "Diapers{" +
                "Size=" + Size +
                ", MinimumWeight=" + MinimumWeight +
                ", MaximumWeight=" + MaximumWeight +
                ", Type='" + Type + '\'' +
                ", MinimumAge=" + MinimumAge +
                ", Hypoallergeni=" + Hypoallergeni +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", UnitOfMeasure=" + UnitOfMeasure +
                '}';
    }
}
