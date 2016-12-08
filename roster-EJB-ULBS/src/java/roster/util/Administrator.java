/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roster.util;

import roster.entity.Useri;
import roster.entity.Enum;
/**
 *
 * @author Mada
 */

public class Administrator extends Useri {
    
    public Administrator() {
        
    }

    public Administrator(String id, String userName, String password) {
        super(id, userName, password);
        this.setNivelAcces(Enum.Administrator);
    }

    public void dropConcurenti() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
