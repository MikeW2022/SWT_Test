package swt_test;
import java.lang.IllegalArgumentException;
import java.io.*;

public class Honorar {
    
    protected static final int TEILER = 100;
    
     // minLength eroeglicht Anpassung der Mindestlaenge
    protected final int minLength = 100; 
   
    public static void main(String args[]) {
        String s = "";
        Honorar h = new Honorar();
       // System.out.println(h.berechneHonorar(s, h.minLength));
    }
        

    
    public int berechneHonorar(String s, int minLength) {  
            if (s == null) {
                    throw new IllegalArgumentException("Abbruch: Kein Text");
            }  if (!minLength(s, minLength)) {
                    throw new IllegalArgumentException("String Laenge: " + s.length() + " Abbruch der Honorarberechnung: Text hat nicht die Mindest-Laenge von " + minLength + " Zeichen.");
            }
                // Honorar berechnen
                return s.length()/TEILER;

    }
    
    //Hilfsfunktion fuer Mindest-Laenge
    public boolean minLength(String s, int minLength) {
        if(s.length() >= minLength)
            return true;
        return false;
    }
}
