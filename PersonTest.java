package swt_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

    Person p;
    
    @BeforeEach
    void setUp() throws Exception {
        p = new Person();
    }
    
    @AfterEach
    void tearDown() throws Exception {
        try {
            p = null;
            assertNull(p);
        } catch (Exception e) {
            System.out.println("Exception bei null Initialisierung");
        }
        finally {
            System.out.println("After Test.\nPerson-Objekt wurde mit null initialisiert");
        }
    }

    // Test auf gueltige Werte zu den Attributen
    @Test
    void test() {
        // Pre-conditions
       assert p.getNachname() != null && p.getNachname() != "";
       assert p.getVorname() != null && p.getVorname() != "";
       assert p.getBirthday() != null && p.getBirthday() != "";
       assert p.getYear(p.getBirthday()) > 1900;
       assert p.getAlter() > 0;
       assert p.getId() != null && p.getId() != "";
       assert p.getStrasse() != null && p.getStrasse() != "";
       assert p.getOrt() != null && p.getOrt() != "";
       assert p.getPlz() != null && p.getPlz() != "";
       assert p.getHausnummer() != null && p.getHausnummer() != ""; 
       
       // stetings
       p.setVorname("Maria");
       p.setNachname("Magdalena");
       p.setBirthday("01.01.2000");
       p.setStrasse("Musterstrasse");
       p.setOrt("Musterstadt");
       p.setPlz("12345");
       p.setHausnummer("23a");
       p.setId("12345");
       
       
       //Post-conditions
       assert p.getNachname() != null && p.getNachname() != "";
       assert p.getVorname() != null && p.getVorname() != "";
       assert p.getBirthday() != null && p.getBirthday() != "";
       assert p.getYear(p.getBirthday()) > 1900;
       assert p.getAlter() > 0;
       assert p.getId() != null && p.getId() != "";
       assert p.getStrasse() != null && p.getStrasse() != "";
       assert p.getOrt() != null && p.getOrt() != "";
       assert p.getPlz() != null && p.getPlz() != "";
       assert p.getHausnummer() != null && p.getHausnummer() != ""; 
    }

}
