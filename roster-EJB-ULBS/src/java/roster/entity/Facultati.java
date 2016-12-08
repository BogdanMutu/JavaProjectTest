package roster.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collection;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author Mada
 */

@Entity
@Table(name = "EJB_ROSTERULBS_FACULTATI")

public class Facultati implements Serializable {

    @Id
    @Column(name="id")
    private String id;
    private String nume;
    @OneToMany(mappedBy="facultate")
    private Collection<Specializari> specs;
    
    public Facultati() {

    }

    public Facultati(String id, String nume) {
        this.id = id;
        this.nume = nume;
    }

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
    
    public Collection<Specializari> getSpecializari() {
        return specs;
    }
}
