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
public class UseriDetails implements java.io.Serializable{
    private String id;
    private String utilizator;
    private String parola;

    public UseriDetails(String id, String utilizator, String parola) {
        this.id = id;
        this.utilizator = utilizator;
        this.parola = parola;
    }

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
    
}
