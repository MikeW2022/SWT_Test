package swt_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Honorar Test")

public class HonorarTest {   

    // sysout + CTRL + SPACE

    String s = "Peace on earth and a good sense for everyone! So help me God!\n";  
    Honorar h = new Honorar();
    public static final int len = 100;

    public String makeTestString(String s) {
        StringBuilder sB = new StringBuilder(s);
        while(sB.toString().length() < h.minLength) {
            sB.append(s);
        }   
        return sB.toString();
    }


    // Test auf Assertion == null
    @Test
    public void testTextIsNull() {
        // throw an exception
        assertEquals(h.berechneHonorar(null, h.minLength), 0);
    }

    // Test auf MindestLaenge
    @Test
    public void testTextIsTooShort() {
        assertEquals(h.berechneHonorar(s, h.minLength), s.length());
    }


    // Test Berechne Honorar
    @Test
    public void testgetHonorar() {
        s = makeTestString(s);
        assertEquals(h.berechneHonorar(s, h.minLength), 1);
    }

}
