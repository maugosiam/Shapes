public abstract class Shapes {
    private String figureType;
    private double area;

    public Shapes(String figureType) {
        this.figureType = figureType;
    }

    //getter and setter to area
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract void areaCalculation();
}