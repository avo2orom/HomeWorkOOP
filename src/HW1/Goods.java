package HW1;

public class Goods {
    public String name;

    public Integer price;

    public Integer Quantity;

    public String UnitOfMeasure;

    public Goods(String name, Integer price, Integer quantity, String unitOfMeasure) {
        this.name = name;
        this.price = price;
        this.Quantity = quantity;
        this.UnitOfMeasure = unitOfMeasure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        this.Quantity = quantity;
    }

    public String getUnitOfMeasure() {
        return UnitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.UnitOfMeasure = unitOfMeasure;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", UnitOfMeasure=" + UnitOfMeasure +
                '}';
    }
}
