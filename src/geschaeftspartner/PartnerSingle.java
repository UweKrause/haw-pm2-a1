package geschaeftspartner;

import java.time.LocalDate;

/**
 *
 * @author Mieke Narjes
 * @author Uwe Krause
 */
public class PartnerSingle extends Partner {

    public Adresse adresse;

    // Konstruktor
    public PartnerSingle(String arg_name, String arg_vorname, LocalDate arg_geburtsdatum, Adresse arg_adresse) {
        super(arg_name, arg_vorname, arg_geburtsdatum);
        this.adresse = arg_adresse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(this.getAdresse());

        return sb.toString();
    }

    /**
     * @return the adresse
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
