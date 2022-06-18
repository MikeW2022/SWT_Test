package test;
import java.lang.IllegalArgumentException;
import java.io.*;

public class Honorar {
    
    public String s = "";
    public static final int TEILER = 100;
    
     // minLength eroeglicht Anpassung der Mindestlänge
    public static int minLength = 100;
    
    public static int berechneHonorar(String s) {
        if (s != null || !minLength(s))
            throw new IllegalArgumentException("Kein Text oder Text hat nicht min." + minLength + " Zeichen.");
        
        // Honorar berechnen
        return s.length()/100;
    }
    
    //Hilfsfunktion für Mindest-Länge
    public static boolean minLength(String s) {
        if(s.length()/100 >= minLength)
            return true;
        return false;
    }
    
}
