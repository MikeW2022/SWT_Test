package de.edlich.mdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;


class KankenkasseTest {
	Krankenkasse k;

	@Test
	void testCalcBeitrag() {
		Gehaltsrechner g = mock(Gehaltsrechner.class); // dyn Proxy
		
		when(g.calcNetto(10000)).thenReturn(5000); // DSL
		// beliebiges Verhalten festlegen
		
		k = new Krankenkasse(g); // Üergebe Mock!!
		
		assertEquals(1000, k.calcBeitrag(10000));
	}
}
