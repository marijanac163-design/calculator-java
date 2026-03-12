import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testCalculateSimpleExpression() {
        Calculator calc = new Calculator();
        double result = calc.calculate("10+5*4+3"); // testiranje prioriteta operacija
        assertEquals(33, result, "Rezultat izraza 10+5*4+3 treba da bude 33");
    }

    @Test
    public void testCalculateDivisionByZero() {
        Calculator calc = new Calculator();
        // Provera da li metoda baca ArithmeticException kod deljenja nulom
        assertThrows(ArithmeticException.class, () -> {
            calc.calculate("5/0");
        }, "Deljenje nulom treba da baci ArithmeticException");
    }
}
