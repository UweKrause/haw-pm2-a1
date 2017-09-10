package geschaeftspartner;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Mieke Narjes
 * @author Uwe Krause
 */
public class PartnerMany extends Partner {

    public List<Adresse> adressen;

    // Konstruktor
    public PartnerMany(String arg_name, String arg_vorname, LocalDate arg_geburtsdatum, List<Adresse> arg_adressen) {
        super(arg_name, arg_vorname, arg_geburtsdatum);
        this.adressen = arg_adressen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(this.adressen);

        return sb.toString();
    }

    // Pflege von List
    /**
     *
     * @param arg_adresse
     */
    public void addAdresse(Adresse arg_adresse) {
        this.adressen.add(arg_adresse);
    }

    /**
     *
     * @param arg_adresse
     */
    public void removeAdresse(Adresse arg_adresse) {
        this.adressen.remove(arg_adresse);
    }
}
