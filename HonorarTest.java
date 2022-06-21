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


    // Test ob Textlange != null
    @Test
    public void testTextIsNull() {
        // s = null;
        if(s == null)
            throw new IllegalArgumentException("Abbruch: Kein Text.");
    }

    // Test auf MindestLaenge
    @Test
    public void testTextIsTooShort() {
        s = makeTestString(s);
        if(!h.minLength(s, len))
            throw new IllegalArgumentException("Abbruch: Text ist zu kurz.");
        else
            h.berechneHonorar(s, h.minLength);
    }


    // Test Berechne Honorar
    @Test
    public void testgetHonorar() {
        s = makeTestString(s);
        h.berechneHonorar(s, h.minLength);
    }



    // korrektheit bei Bildern

    /*
    @Test
    public void testTextHasRange() {
        int len = s.length();
        try {
            if (len > 10000 and < 20000);
                System.out.println("Honorar.Stufe 1 ab 10000 W�rter");
                break;
            }
            catch(Exception e) {
                System.out.println("Honorar.Stufe 1 ab 10000 W�rter");
            }
        }

    //honrorarBerechnen(s)

    // Methoden+
   // countPictures
   //  countText
     */

}
