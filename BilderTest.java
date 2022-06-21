package swt_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Bilder Test")

class BilderTest {

    double s = 1024;
    Bilder b0 = new Bilder();

    
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
        assertEquals(new Bilder(s).getS(), s);

    }    
    
    // Test auf Anzahl
    @Test
    public void testCount() {
        assertEquals(new Bilder(s).getC(), 3);
    }  

}
