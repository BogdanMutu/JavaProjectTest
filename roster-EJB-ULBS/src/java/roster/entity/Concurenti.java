package roster.entity;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Mada
 */
@Entity
@Table(name = "EJB_ROSTERULBS_CONCURENTI")
@NamedQueries({
       @NamedQuery(name = "entity.Concurenti.gasesteTotiConcurenti", query = "SELECT e FROM Concurenti e"),
     @NamedQuery(name = "entity.Concurenti.gasesteConcurentiNume", query = "SELECT e FROM Concurenti e WHERE e.nume = :nume")
    ,@NamedQuery(name = "entity.Concurenti.gasesteConcurentiCnp", query = "SELECT e FROM Concurenti e WHERE e.cnp = :cnp")
    })
public class Concurenti implements Serializable {

    private String id;
    private String nume;
    private String prenume;
    private String cnp;
    private String telefon;
    private String adresa;
    
    public Concurenti(){
        
    }

    public Concurenti(String id, String nume, String prenume, String cnp, String telefon, String adresa) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
