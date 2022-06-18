package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CalculatorTest {
    Calculator calc = new Calculator();
    
    //@BeforeEach
    
    
    @Test
    void testAdd() {
        assertEquals(calc.rechnen(10, 2, '/'));
    }

}
