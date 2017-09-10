package geschaeftspartner;

import java.time.LocalDate;

/**
 *
 * @author Mieke Narjes
 * @author Uwe Krause
 */
public abstract class Partner {
    // abstract verhindert, dass ein Objekt dieser Klasse erstellt werden kann

    public String name;
    public String vorname;
    public LocalDate geburtsdatum;

    // Konstruktor
    public Partner(String arg_name, String arg_vorname, LocalDate arg_geburtsdatum) {

        this.name = arg_name;
        this.vorname = arg_vorname;
        this.geburtsdatum = arg_geburtsdatum;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(this.getName());
        sb.append(" ");

        sb.append(this.getVorname());
        sb.append(" ");

        sb.append(this.getGeburtsdatum());
        sb.append(" ");

        return sb.toString();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the vorname
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * @param vorname the vorname to set
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * @return the geburtsdatum
     */
    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    /**
     * @param geburtsdatum the geburtsdatum to set
     */
    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }
}
