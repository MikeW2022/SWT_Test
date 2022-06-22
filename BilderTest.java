package swt_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.*;

@DisplayName("Bilder Test")

class BilderTest {

    double s = 1024;
    Bilder b0;
    
    @BeforeEach
    void setUp() throws Exception{
        b0 = new Bilder();
    }
    
    @AfterEach
    void tearDown() throws Exception {
        try {
            b0 = null;
            assertNull(b0);
        } catch (Exception e) {
            System.out.println("Exception bei null Initialisierung");
        }
        finally {
            System.out.println("After Test.\nBilder-Objekt wurde mit null initialisiert");
        }
    }
       
    // Test auf null Objekt
    @Test
    public void testNullObject() {
        try {
            new Bilder().getDesc();
        } catch (NullPointerException e) {
            assertTrue(e instanceof NullPointerException);
        }
    }
    
    // Test auf Nicht null Objekt
    @Test
    public void testNotNullObject() {
        assert new Bilder() != null;
    }
    
    // Test auf Bezeichner
    @Test
    public void testDesc() {
        b0.setDesc("bild1");
        assert b0.getDesc() != null && b0.getDesc() != "";
    }
    
    
    // Test auf Bildgröße
    @Test
    public void testSize() {
        assertEquals(s, new Bilder(s).getS());

    }    
    
    // Test auf Anzahl
    @Test
    public void testCount() {
        assertEquals(3, new Bilder(s).getC());
    }  

}
