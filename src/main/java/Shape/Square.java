package Shape;
import Base.ShapeInterface;

public class Square implements ShapeInterface {

    private double _side;

    public Square(double side) {
        this._side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * this._side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this._side, 2);
    }

}
