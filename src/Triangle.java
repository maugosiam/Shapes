public class Triangle extends Shapes {

    private double height;
    private double baseLenght;

    public Triangle(String figureType, double height, double baseLenght) {
        super(figureType);
        this.height = height;
        this.baseLenght = baseLenght;
    }

    @Override
    public void areaCalculation() {
        setArea(height * baseLenght /2);
    }
}
