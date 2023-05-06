package HW1;

public class Masks extends HygieneItems{
    public Masks(String name, Integer price, Integer quantity, String unitOfMeasure, Integer numberOfPiecesPerPack) {
        super(name, price, quantity, unitOfMeasure, numberOfPiecesPerPack);
    }

    @Override
    public String toString() {
        return "Masks{" +
                "NumberOfPiecesPerPack=" + NumberOfPiecesPerPack +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", UnitOfMeasure=" + UnitOfMeasure +
                '}';
    }
}
