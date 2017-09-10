package geschaeftspartner;

import java.time.LocalDate;

import org.junit.Test;

/**
 *
 * @author Mieke Narjes
 * @author Uwe Krause
 */
public class PartnerTest {

    @Test
    public void toStringTest() {
        LocalDate datum = new LocalDate(1111, 11, 11);
        Partner partner = new PartnerSingle("Name", "Vorname", datum);
    }

    @Test
    public void getTest() {
        LocalDate datum = new LocalDate(1111, 11, 11);
        Partner partner = new PartnerSingle("Name", "Vorname", datum);

        assertEquals("Name", partner.getName());
        assertEquals("Vorname", partner.getVorname());
        assertEquals(datum, partner.getGeburtsdatum());
    }

    @Test
    public void setTest() {
        LocalDate datum = new LocalDate(1111, 11, 11);
        Partner partner = new PartnerSingle("Name", "Vorname", datum);
        partner.setName("Name_2");
        partner.setVorname("Vorname_2");
        partner.setGeburtsdatum(datum_2);

        assertEquals("Name_2", partner.getName());
        assertEquals("Vorname_2", partner.getVorname());
        assertEquals(datum_2, partner.getGeburtsdatum());
    }

    /*
	@Test
	public void getNameTest() {}
	@Test
	public void setNameTest() {}
	@Test
	public void getVornameTest() {}
	@Test
	public void setVornameTest() {}
	@Test
	public void getGeburtsdatumTest() {}
	@Test
	public void setGeburtsdatumTest() {}
     */
}
