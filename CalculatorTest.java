package swt_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Calculator Test")
public class CalculatorTest {
    private Calculator calc = new Calculator(); 
    
    int z1 = 10;
    int z2 = 0;
    char op = '/';
    
    // Test Division
    @Test 
    public void testCalcDiv() {
        System.out.println("Test zur Division");
        assertEquals(calc.rechnen(z1, z2, op), 2);
    }
    
    
    // Test Addition
    @Test
    public void testCalcAdd() {
        op = '+';
        System.out.println("Test zur Addition");
        assertEquals(calc.rechnen(z1, z2, op), 15);
    }
    
}
