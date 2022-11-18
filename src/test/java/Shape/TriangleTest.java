package Shape;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void calculatePerimeter() {
        Triangle trianglePerimeterTestCase1 = new Triangle(2.0, 3.0, 5.0);
        Triangle trianglePerimeterTestCase2 = new Triangle(12.5, 13.5, 1.5);
        assertEquals(10.0, trianglePerimeterTestCase1.calculatePerimeter());
        assertEquals(27.5, trianglePerimeterTestCase2.calculatePerimeter());
    }

    @Test
    void calculateArea() {
        Triangle triangleAreaTestCase1 = new Triangle(10.0, 20.0);
        Triangle triangleAreaTestCase2 = new Triangle(3, 4);
        Triangle triangleAreaTestCase3 = new Triangle(5, 3);
        Triangle triangleAreaTestCase4 = new Triangle(12, 15);

        assertAll(() -> assertEquals(100.0, triangleAreaTestCase1.calculateArea()),
                () -> assertEquals(6, triangleAreaTestCase2.calculateArea()),
                () -> assertEquals(7.5, triangleAreaTestCase3.calculateArea()),
                () -> assertEquals(90, triangleAreaTestCase4.calculateArea()));
    }
}