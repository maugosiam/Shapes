public class Rectangle extends Shapes {

    private double longerSideLenght;
    private double shorterSideLenght;


    public double getLongerSideLenght() {
        return longerSideLenght;
    }

    public void setLongerSideLenght(double longerSideLenght) {
        this.longerSideLenght = longerSideLenght;
    }


    public Rectangle(String figureType, double longerSideLenght, double shorterSideLenght) {
        super(figureType);
        if (longerSideLenght >= 0 && shorterSideLenght >= 0) {
            this.longerSideLenght = longerSideLenght;
            this.shorterSideLenght = shorterSideLenght;
        }
    }
    @Override
    public void areaCalculation() {
        setArea(longerSideLenght * shorterSideLenght);
    }
}