public abstract class Shapes {
    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

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