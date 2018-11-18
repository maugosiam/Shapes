public class InheritanceProgram {
    public static void main(String[] args) {

        Shapes[] figury = {
                new Circle("circle", 10),
                new Triangle("triangle", 10, 30),
                new Rectangle("rectangle", 24, 11),
                new Square("square", 22)

        };

        for(Shapes i:figury){
            i.areaCalculation();
            System.out.println("The area of "+i.getFigureType()+" is "+i.getArea()+".");
        }
    }
}