public class Circle extends Shapes{


    private int radius;

    public Circle(String figureType, int radius) {
        super(figureType);
        this.radius = radius;
    }

    @Override
    public void areaCalculation() {
       setArea(Math.PI * radius * radius);
    }
}