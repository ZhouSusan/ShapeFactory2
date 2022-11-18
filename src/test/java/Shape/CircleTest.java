package Shape;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void calculatePerimeter() {
        Circle testPeriCircle1 = new Circle(7.5);
        Circle testPeriCircle2 = new Circle(5);
        assertAll(() -> assertEquals( 47.12388980384689, testPeriCircle1.calculatePerimeter()),
                () -> assertEquals(31.41592653589793, testPeriCircle2.calculatePerimeter()));
    }

    @org.junit.jupiter.api.Test
    void calculateArea() {
        Circle testAreaCircle1 = new Circle(7.5);
        Circle testAreaCircle2 = new Circle(5);
        assertAll(() -> assertEquals(176.71458676442586, testAreaCircle1.calculateArea()),
                () -> assertEquals(78.53981633974483, testAreaCircle2.calculateArea()));
    }
}