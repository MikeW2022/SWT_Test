package mocktest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KrankenkasseTest {

  Krankenkasse k;
    
    @BeforeEach
    void setUp() throws Exception{
        k = new Krankenkasse();
    }

    @Test
    void testCalcBeitrag() {
        // Gehaltsrechner g = mock(Gehaltsrechner.class); // dyn Proxy
        
        // when(g.calcNetto(10000)).thenReturn(5000); // DSL
        // beliebiges Verhalten festlegen
        
        // k = new Krankenkasse(g); // Üergebe Mock!!
        
        assertEquals(200, k.calcBeitrag(2000));
    }

}
