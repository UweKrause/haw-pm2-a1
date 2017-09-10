package geschaeftspartner;

import java.time.LocalDate;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 * @author Mieke Narjes
 * @author Uwe Krause
 */
public class AdresseSingleTest {

    @Test
    public void toStringTest() {
        PartnerSingle partner = new PartnerSingle("Name", "Vorname", LocalDate.of(2016, 1, 1));
        AdresseSingle adresse = new AdresseSingle("Strasse", 1, 12345, "Ort", "Land",
                partner);

        assertEquals("Strasse 1, 12345 Ort, Land, ....", adresse.toString()); // hier fehlt noch was
    }

    @Test
    public void getPartnerTest() {
//		Partner partner = new PartnerSingle("Name", "Vorname", datum);
        AdresseSingle adresse = new AdresseSingle("Strasse", 1, 12345, "Ort", "Land",
                partner);

        assertEquals(partner, adresse.getPartner());
    }

    @Test
    public void setPartnerTest() {
        //	Partner partner = new PartnerSingle("Name", "Vorname", datum);
        //Partner partner_2 = new PartnerSingle("Name_2", "Vorname_2", datum_2);
        AdresseSingle adresse = new AdresseSingle("Strasse", 1, 12345, "Ort", "Land",
                partner);

        adresse.setPartner(partner_2);
        assertEquals(partner, adresse.getPartner());
    }

}
