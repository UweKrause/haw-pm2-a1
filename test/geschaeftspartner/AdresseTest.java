/**
 *
 */
package geschaeftspartner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author Mieke Narjes
 * @author Uwe Krause
 */
public class AdresseTest {

    /**
     * Liefert die ToString Methode das erwartete Ergebnis?
     */
    @Test
    public void toStringTest() {
        Adresse adresse = new AdresseSingle("Strasse", 1, 12345, "Ort", "Land",
                null);

        assertEquals("Strasse 1, 12345 Ort, Land, null", adresse.toString());
    }

    /**
     * Testet erwartetes Verhalten bei den Gettern und Settern
     */
    @Test
    public void getTest() {
        Adresse adresse = new AdresseSingle("Strasse", 1, 12345, "Ort", "Land",
                null);

        assertEquals("Strasse", adresse.getStrasse());
        assertEquals("1", adresse.getHausnummer().toString());
        assertEquals("12345", adresse.getPlz().toString());
        assertEquals("Ort", adresse.getOrt());
        assertEquals("Land", adresse.getLand());
    }

    @Test
    public void setTest() {
        Adresse adresse = new AdresseSingle("Strasse", 1, 12345, "Ort", "Land",
                null);

        adresse.setStrasse("Strasse_2");
        adresse.setHausnummer(2);
        adresse.setPlz(67890);
        adresse.setOrt("Ort_2");
        adresse.setLand("Land_2");

        assertEquals("Strasse_2", adresse.getStrasse());
        assertEquals("2", adresse.getHausnummer().toString());
        assertEquals("67890", adresse.getPlz().toString());
        assertEquals("Ort_2", adresse.getOrt());
        assertEquals("Land_2", adresse.getLand());
    }
    /*
	@Test
	public void getStrasseTest() {
		Adresse adresse = new AdresseSingle("Strasse", 1, 12345, "Ort", "Land",
				null);
		assertEquals("Strasse", adresse.getStrasse());
	}
	@Test
	public void setStrasseTest() {
		Adresse adresse = new AdresseSingle("Strasse", 1, 12345, "Ort", "Land",
				null);
		adresse.setStrasse("Strasse_2");
		assertEquals("Strasse_2", adresse.getStrasse());
	}
	@Test
	public void getHausnummerTest() {
		Adresse adresse = new AdresseSingle("Strasse", 1, 12345, "Ort", "Land",
				null);
		assertEquals(1, adresse.getHausnummer());
	}
	@Test
	public void setHausnummerTest() {
		Adresse adresse = new AdresseSingle("Strasse", 1, 12345, "Ort", "Land",
				null);
		adresse.setHausnummer(2);
		assertEquals(2, adresse.getHausnummer());
	}
	@Test
	public void getPlzTest() {}
	@Test
	public void setPlzTest() {}
	@Test
	public void getOrtTest() {}
	@Test
	public void setOrtTest() {}
	@Test
	public void getLandTest() {}
	@Test
	public void setLandTest() {}
     */
}
