/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roster.request;
import roster.entity.*;
import java.util.Collection;
import java.util.List;
import javax.ejb.Remote;
import roster.util.ConcurentiDetails;
import roster.util.FacultatiDetails;
import roster.util.SpecializariDetails;
import roster.util.UseriDetails;

/**
 *
 * @author Mada
 */
@Remote
public interface Request {
     void createFacultati(
        String id,
        String nume);
     void createUseri(
             String id,
             String utilizator,
             String parola);
     void createConcurenti(
             String id,
             String nume,
             String prenume,
             String cnp,
             String telefon,
             String adresa);
     void createSpecializari(
             String id,
             String nume,
             String idFacultate);
   
     List<ConcurentiDetails> getAllConcurenti();
     List<ConcurentiDetails> getConcurentiNume(String nume);
     List<ConcurentiDetails> getConcurentiCnp(String cnp);
}
