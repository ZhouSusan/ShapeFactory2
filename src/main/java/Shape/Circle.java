package Shape;
import Base.ShapeInterface;

public class Circle implements ShapeInterface {

    private double _radius;
    public Circle(double radius) {
        this._radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this._radius;
    }

    @Override
    public double  calculateArea() {
        return this._radius * this._radius * Math.PI;
    }
}
