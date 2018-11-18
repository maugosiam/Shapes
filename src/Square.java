public class Square extends Rectangle {



    public Square(String figureType, double longerSideLenght, double shorterSideLenght) {
        super(figureType, longerSideLenght, longerSideLenght);
        }

    public Square(String figureType, double longerSideLenght) {
        super(figureType, longerSideLenght, longerSideLenght);
    }


    @Override
    public void areaCalculation() {
        setArea(getLongerSideLenght()*getLongerSideLenght());
    }
}