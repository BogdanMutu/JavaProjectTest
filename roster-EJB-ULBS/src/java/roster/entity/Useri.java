package roster.entity;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Mada
 */
@Entity
@Table(name = "EJB_ROSTERULBS_USERI")
public class Useri implements Serializable {

    private String id;
    private String utilizator;
    private String parola;
    private Enum nivelAcces;

    
    public Useri(){
        
    }

    public Useri(String id, String utilizator, String parola) {
        this.id = id;
        this.utilizator = utilizator;
        this.parola = parola;
    }
    
    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUtilizator() {
        return utilizator;
    }

    public void setUtilizator(String utilizator) {
        this.utilizator = utilizator;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }   
     public Enum getNivelAcces() {
        return nivelAcces;
    }

    public void setNivelAcces(Enum accces) {
        this.nivelAcces = accces;
    }
}
