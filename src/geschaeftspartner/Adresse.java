package geschaeftspartner;

/**
 *
 * @author Mieke Narjes
 * @author Uwe Krause
 */
public abstract class Adresse {
    // abstract verhindert, dass ein Objekt dieser Klasse erstellt werden kann

    public String strasse;
    public Integer hausnummer;
    public Integer plz;
    public String ort;
    public String land;

    private Boolean flag;

    // Konstruktor
    public Adresse(String arg_strasse, Integer arg_hausnummer, Integer arg_plz,
            String arg_ort, String arg_land) {

        this.strasse = arg_strasse;
        this.hausnummer = arg_hausnummer;
        this.plz = arg_plz;
        this.ort = arg_ort;
        this.land = arg_land;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getStrasse());
        sb.append(" "); // kein Komma
        sb.append(this.getHausnummer());
        sb.append(", ");
        sb.append(this.getPlz());
        sb.append(" "); // kein Komma
        sb.append(this.getOrt());
        sb.append(", ");
        sb.append(this.getLand());

        return sb.toString();

    }

    /**
     * @return the strasse
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * @param strasse the strasse to set
     */
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    /**
     * @return the hausnummer
     */
    public Integer getHausnummer() {
        return hausnummer;
    }

    /**
     * @param hausnummer the hausnummer to set
     */
    public void setHausnummer(Integer hausnummer) {
        this.hausnummer = hausnummer;
    }

    /**
     * @return the plz
     */
    public Integer getPlz() {
        return plz;
    }

    /**
     * @param plz the plz to set
     */
    public void setPlz(Integer plz) {
        this.plz = plz;
    }

    /**
     * @return the ort
     */
    public String getOrt() {
        return ort;
    }

    /**
     * @param ort the ort to set
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    /**
     * @return the land
     */
    public String getLand() {
        return land;
    }

    /**
     * @param land the land to set
     */
    public void setLand(String land) {
        this.land = land;
    }
}
