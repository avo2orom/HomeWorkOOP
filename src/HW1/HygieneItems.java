package HW1;

public class HygieneItems extends Goods {
    public Integer NumberOfPiecesPerPack;

    public HygieneItems(String name, Integer price, Integer quantity, String unitOfMeasure, Integer numberOfPiecesPerPack) {
        super(name, price, quantity, unitOfMeasure);
        this.NumberOfPiecesPerPack = numberOfPiecesPerPack;
    }

    @Override
    public String toString() {
        return "HygieneItems{" +
                "NumberOfPiecesPerPack=" + NumberOfPiecesPerPack +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", UnitOfMeasure=" + UnitOfMeasure +
                '}';
    }
}
