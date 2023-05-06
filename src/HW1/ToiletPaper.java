package HW1;

public class ToiletPaper extends HygieneItems {
    public Integer NumberOfLayers;

    public ToiletPaper(String name, Integer price, Integer quantity, String unitOfMeasure, Integer numberOfPiecesPerPack, Integer numberOfLayers) {
        super(name, price, quantity, unitOfMeasure, numberOfPiecesPerPack);
        this.NumberOfLayers = numberOfLayers;
    }

    @Override
    public String toString() {
        return "ToiletPaper{" +
                "NumberOfLayers=" + NumberOfLayers +
                ", NumberOfPiecesPerPack=" + NumberOfPiecesPerPack +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", UnitOfMeasure=" + UnitOfMeasure +
                '}';
    }
}
