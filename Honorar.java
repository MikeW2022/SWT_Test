package swt_test;
import java.lang.IllegalArgumentException;
import java.io.*;

public class Honorar {
    
    protected static final int TEILER = 100;
    
    // Honorar in EUR
    protected static final double HONORAR = 0.25;
    
     // minLength eroeglicht Anpassung der Mindestlaenge
    protected final int minLength = 100; 
  
    protected static final String COMPARE = "Picture";
    
    public double berechneHonorarText(String s, int minLength) {  
            if (s == null) {
                    throw new IllegalArgumentException("Abbruch: Kein Text");
            }  if (!minLength(s, minLength)) {
                    throw new IllegalArgumentException("String Laenge: " + s.length() + " Abbruch der Honorarberechnung: Text zu kurz. Mindest-Laenge:" + minLength + " Zeichen.");
            }
                // Honorar berechnen
                return s.length()/TEILER*HONORAR;
    }
    
    public double getHonorarBilder(String s, String compare) {  
        if (s == null) {
                throw new IllegalArgumentException("Abbruch: Keine Bilder");
        }  if (countPicture(s, compare) == 0)
                {
                throw new IllegalArgumentException("Abbruch der Honorarberechnung: Text enthält keine Bilder");
        }
            // Honorar berechnen
        System.out.println("Inhalt von Text: " + s);
            return countPicture(s, compare) * HONORAR;
}
    
    //Hilfsfunktion fuer Mindest-Laenge
    public boolean minLength(String s, int minLength) {
        if(s.length() >= minLength)
            return true;
        return false;
    }
    
    //Hilfsfunktion zum Zählen der Anzahl Vorkommen zum Schlüsselwort "Picture"
    public int countPicture(String s, String compare) {
        String str[] = s.split(" ");
        int c = 0;
           for(int i = 0; i < str.length ;i++){
               if(compare.equals(str[i]))
                   c++;
            }
           return c;
        }
}
