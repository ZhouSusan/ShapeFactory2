package Test;
import Shape.Circle;

public class Test {
    public static void main(String[] args) {
        Circle cicly = new Circle(7.5);
        Circle twistie = new Circle(5);
        System.out.println(cicly.calculatePerimeter());
        System.out.println(cicly.calculateArea());
        System.out.println("****************************");
        System.out.println(twistie.calculatePerimeter());
        System.out.println(twistie.calculateArea());
    }
}