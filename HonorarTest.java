package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class HonorarTest {

    String s = "";
    
    Honorar h = new Honorar();
    
    
    // muss
    @Test
    public void testTextIsNull() {
        try {
                if (s == null);
        }
        catch(IOException e) {
            System.out.println("Kein Text vorhanden");
        }
        
    }

    
    @Test
    public void testgetHonorar() {
        
    }
    
    // muss nicht
    @Test
    public void testTextHasMin() {
        try {
            if (s.length() < 10000);
        }
        catch(Exception e) {
            System.out.println("Honorar wird erst ab Länge > 10000 berechnet");
        }
    }
    
    // korrektheit bei Bildern
    
    @Test
    public void testTextHasRange() {
        int len = s.length();
        try {
            if (len > 10000 and < 20000);
                System.out.println("Honorar.Stufe 1 ab 10000 Wörter");
                break;
            }
            catch(Exception e) {
                System.out.println("Honorar.Stufe 1 ab 10000 Wörter");
            }
        }
    
    //honrorarBerechnen(s)
    
    // Methoden+
   // countPictures
   //  countText
    
}
