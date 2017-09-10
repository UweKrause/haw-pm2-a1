package geschaeftspartner;

import java.util.List;

/**
 *
 * @author Mieke Narjes
 * @author Uwe Krause
 */
public class AdresseMany extends Adresse {

    public List<Partner> partner;

    // Konstruktor 
    public AdresseMany(String arg_strasse, Integer arg_hausnummer, Integer arg_plz, String arg_ort, String arg_land, List<Partner> arg_partner) {
        super(arg_strasse, arg_hausnummer, arg_plz, arg_ort, arg_land);
        this.partner = arg_partner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(this.partner);

        return sb.toString();
    }

    // Pflege von List
    public void addPartner(Partner arg_partner) {
        this.partner.add(arg_partner);
    }

    public void removePartner(Partner arg_partner) {
        this.partner.remove(arg_partner);
    }
}
