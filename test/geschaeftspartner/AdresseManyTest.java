package geschaeftspartner;

import static org.junit.Assert.*;
import geschaeftspartner.Adresse;
import geschaeftspartner.AdresseSingle;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Mieke Narjes
 * @author Uwe Krause
 */
public class AdresseManyTest {

    @Test
    public void toStringTest() {
        Partner partner = new PartnerSingle("Name", "Vorname", LocalDate.of(2016, 1, 1), arg_adresse);
        Adresse adresse = new AdresseSingle("Strasse", 1, 12345, "Ort", "Land",
                partner);

        assertEquals("Strasse 1, 12345 Ort, Land, ....", adresse.toString()); // hier fehlt noch was
    }

    @Test
    public void addPartnerTest() {
        Partner partner = new PartnerSingle("Name", "Vorname", LocalDate.of(2016, 1, 1));			// !!!
        Adresse adresse = new AdresseSingle("Strasse", 1, 12345, "Ort", "Land",
                null);

        adresse.addPartner(partner);
        assertEquals(String, adresse.toString());
    }

    @Test
    public void removePartnerTest() {
        Partner partner = new PartnerSingle("Name", "Vorname", datum); 			// !!!
        Adresse adresse = new AdresseSingle("Strasse", 1, 12345, "Ort", "Land",
                partner);

        adresse.removePartner(partner);
        assertEquals(String, adresse.toString());		 // !!!
    }
}
