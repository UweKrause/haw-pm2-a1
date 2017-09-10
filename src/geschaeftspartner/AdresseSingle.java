package geschaeftspartner;

/**
 *
 * @author Mieke Narjes
 * @author Uwe Krause
 */
public class AdresseSingle extends Adresse {

    public Partner partner;

    // Konstruktor
    public AdresseSingle(String arg_strasse, Integer arg_hausnummer, Integer arg_plz, String arg_ort, String arg_land, Partner arg_partner) {
        super(arg_strasse, arg_hausnummer, arg_plz, arg_ort, arg_land);
        this.partner = arg_partner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(this.getPartner());

        return sb.toString();

    }

    /**
     * @return the partner
     */
    public Partner getPartner() {
        return partner;
    }

    /**
     * @param partner the partner to set
     */
    public void setPartner(Partner partner) {
        this.partner = partner;
    }
}
