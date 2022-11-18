package Test;
import Shape.Circle;
import Shape.Triangle;

public class Test {
    public static void main(String[] args) {
        Circle cicly = new Circle(7.5);
        Circle twistie = new Circle(5);
        System.out.format("Perimeter of circle: %s", cicly.calculatePerimeter());
        System.out.format("\nArea of circle: %s", cicly.calculateArea());
        System.out.println("\n****************************");
        System.out.format("\nPerimeter of circle2: %s", twistie.calculatePerimeter());
        System.out.format("\nArea of circle2: %s", twistie.calculateArea());

        Triangle triango = new Triangle(12.5, 13.5, 1.5);
        Triangle triangolo = new Triangle(10.0, 20.0);
        System.out.println("\n****************************");
        System.out.format("\nPerimeter Triangle: %s", triango.calculatePerimeter());
        System.out.format("\nArea of Triangle: %s", triangolo.calculateArea());
    }
}