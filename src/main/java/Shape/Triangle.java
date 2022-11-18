package Shape;
import Base.ShapeInterface;

public class Triangle implements ShapeInterface{

    private double _a;
    private double _b;
    private double _c;

    private double _width;
    private double _height;


    public Triangle(double height, double width) {
        this._height = height;
        this._width = width;
    }

    public Triangle(double a, double b, double c) {
        this._a = a;
        this._b = b;
        this._c = c;
    }

    @Override
    public double calculatePerimeter() {
        return _a + _b + _c;
    }

    @Override
    public double calculateArea() {
        return (_height * _width) / 2;
    }
}
