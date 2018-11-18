public class InheritanceProgram {
    public static void main(String[] args) {

        Circle circle = new Circle("circle", 10);
        Triangle triangle = new Triangle("triangle", 7.16, 40);
        Rectangle rectangle = new Rectangle("rectangle", 9, 1);

        Shapes[] figury = {
                new Circle("circle", 10),
                new Triangle("triangle", 10, 30),
                new Rectangle("rectangle", 24, 11),
                new Square("square", 22)

        };

        for(Shapes i:figury){
            i.areaCalculation();
            System.out.println(i.getArea());
        }
        /*System.out.printf("%.2f%n", calculateFigureArea(circle));
        System.out.printf("%.2f%n", calculateFigureArea(triangle));
        System.out.printf("%.2f%n", calculateFigureArea(rectangle));*/
    }

    /*public static double calculateFigureArea(Shapes shape) {
        shape.areaCalculation();
        return shape.getArea();
    }
*/
}