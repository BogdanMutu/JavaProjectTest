/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roster.util;

/**
 *
 * @author Mada
 */
public class SpecializariDetails implements java.io.Serializable {
    
    private String id;
    private String nume;
  

    public SpecializariDetails(String id, String nume) {
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

    
}
