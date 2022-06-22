package swt_test;

import org.junit.jupiter.api.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Honorar Test")

public class HonorarTest {   

    // sysout + CTRL + SPACE

    String s = "Peace on earth and a good sense for everyone! So help me God!\n";  
    public static final int len = 100;
    Honorar h;

    @BeforeEach
    void setUp() throws Exception{
        h = new Honorar();
        System.out.println("Honorar-Objekt instanziiert");
    }
    
    @AfterEach
    void tearDown() throws Exception {
        try {
            h = null;
            assertNull(h);
        } catch (Exception e) {
            System.out.println("Exception bei null Initialisierung");
        }
        finally {
            System.out.println("After Test.\nHonorar-Objekt wurde mit null initialisiert");
        }
    }
    
    public String makeTestString(String s) {
        StringBuilder sB = new StringBuilder(s);
        while(sB.toString().length() < h.minLength) {
            sB.append(s);
        }   
        return sB.toString();
    }


    // Test auf Text == null
    @Test
    public void testTextIsNull() {
        // throw an exception
        assertEquals(0, h.berechneHonorarText(null, h.minLength));
    }
    
    // Test auf Text != ""
    @Test
    public void testTextIsEmpty() {
        // throw an exception
        s = "";
        assert s != "";
    }

    
    // Test auf MindestLaenge
    @Test
    public void testTextIsTooShort() {
        // Methode minLength() gibt true zurück, wenn Text die Mindestlänge hat
        assertTrue(h.minLength(s, h.minLength));
        assertFalse(h.minLength(s, h.minLength));
            
    }

    // Test ob Wert !=0
    @Test
    public void testWert() {
        assert h.HONORAR !=0;
    }

    // Test Berechne Honorar für Text
    @Test
    public void testgetHonorarText() {
        s = makeTestString(s);
        assertEquals(1, h.berechneHonorarText(s, h.minLength));
    }
    
    // Test Berechne Honorar für Bilder
    @Test
    public void testgetHonorarBilder() {
        s = "Ein Picture sagt mehr als tausend Worte";
        assertEquals(0.25, h.getHonorarBilder(s, h.COMPARE));
    }

}
