package swt_test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;

@DisplayName("Calculator Test")
public class CalculatorTest {
   
    private Calculator calc; 
    
    @BeforeEach
    void setUp() throws Exception {
       calc = new Calculator(); 
    }
    
    @AfterEach
    void tearDown() throws Exception {
        try {
            calc = null;
            assertNull(calc);
        } catch (Exception e) {
            System.out.println("Exception bei null Initialisierung");
        }
        finally {
            System.out.println("After Test.\nCalculator-Objekt wurde mit null initialisiert");
        }
    }

    int z1 = 10;
    int z2 = 2;
    char op = '/';

    // Test Division / 0
    @Test 
    public void testDivEx0() {
        System.out.println("Test auf Exception zur Division");
        op = '/';
        z2=0;
        assertThrows(ArithmeticException.class,() -> {
            calc.rechnen(z1, z2, op); 
        });
    }
    
    // alterenativer Test zur Division / 0
    @Test 
    public void testDivEx1() {
        System.out.println("Test auf Exception zur Division");
        op = '/';
        z2=0;
        assertThrows(IllegalArgumentException.class,()->{
            calc.rechnen(z2, z1, op);
        });
    }

    // Test Division
    @Test 
    public void testCalcDiv() {
        System.out.println("Test zur Division");
        assertEquals(calc.rechnen(z1, z2, op), 5);
    }


    // Test Addition
    @Test
    public void testCalcAdd() {
        op = '+';
        System.out.println("Test zur Addition");
        assertEquals(calc.rechnen(z1, z2, op), 12);
    }

}
