package Shape;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculatePerimeter() {
        Square squarePerimeterTestCaseOne = new Square(10);
        Square squarePerimeterTestCaseTwo = new Square(23);
        Square squarePerimeterTestCaseThree = new Square(16);
        assertAll(() -> assertEquals(40.0, squarePerimeterTestCaseOne.calculatePerimeter()),
                () -> assertEquals(92.0, squarePerimeterTestCaseTwo.calculatePerimeter()),
                () -> assertEquals(64.0, squarePerimeterTestCaseThree.calculatePerimeter()));
    }

    @Test
    void calculateArea() {
        Square squareAresTestCaseOne = new Square(10);
        Square squareAresTestCaseTwo = new Square(23);
        Square squareAresTestCaseThree = new Square(16);
        assertAll(() -> assertEquals(100.0, squareAresTestCaseOne.calculateArea()),
                () -> assertEquals(529.0, squareAresTestCaseTwo.calculateArea()),
                () -> assertEquals(256.0, squareAresTestCaseThree.calculateArea()));
    }
}