
package roster.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
/**
 *
 * @author Mada
 */
@Entity
@Table(name = "EJB_ROSTERULBS_SPECIALIZARI")
public class Specializari implements Serializable {
    
    @Id
    private String id;
    private String nume;
    @ManyToOne
    @JoinColumn(name="ID_FACULTATE")
    public Facultati facultate;
    
    public Specializari(){
        
    }

    
    public Specializari(String id, String nume, Facultati facultate) {
        this.id = id;
        this.nume = nume;
        this.facultate = facultate;
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
    public void setNume(String Nume) {
        this.nume = Nume;
    }
    
    //@ManyToOne
    public Facultati getFacultate() {
        return facultate;
    }
    
    public void setFacultate(Facultati facultate){
        this.facultate = facultate;
    }
}
