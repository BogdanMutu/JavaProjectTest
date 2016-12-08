/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roster.request;

import roster.entity.Concurenti;
import roster.entity.Facultati;
import roster.entity.Specializari;
import roster.entity.Useri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import roster.util.ConcurentiDetails;
import roster.util.FacultatiDetails;
import roster.util.SpecializariDetails;
import roster.util.UseriDetails;

/**
 *
 * @author Mada
 */
@Stateful
public class RequestBean implements Request {

    private static final Logger logger = Logger.getLogger(
            "request.RequestBean");
    @PersistenceContext
    private EntityManager em;

    @Override
    public void createFacultati(
            String id,
            String nume) {
        logger.info("createFacultati");

        try {
            Facultati facultati = new Facultati(id, nume);
            em.persist(facultati);
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }

    @Override
    public void createConcurenti(
            String id,
            String nume,
            String prenume,
            String cnp,
            String telefon,
            String  adresa) 
    {
        logger.info("createConcurenti");

        try {
            Concurenti concurenti = new Concurenti(id, nume, prenume, cnp, telefon, adresa);
            em.persist(concurenti);
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }

    @Override
    public void createSpecializari(
            String id,
            String nume,
            String idFacultate) {
        logger.info("createSpecializari");

        try {
            Facultati facultate = new Facultati(idFacultate, "");
            Specializari specializari = new Specializari(id, nume, facultate);
            em.persist(specializari);
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }

    @Override
    public void createUseri(
            String id,
            String utilizator,
            String parola) {
        logger.info("createUseri");

        try {
            Useri useri = new Useri(id, utilizator, parola);
            em.persist(useri);
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }


    private List<ConcurentiDetails> copyConcurentiToDetails(List<Concurenti> concurenti) {
        List<ConcurentiDetails> detailsList = new ArrayList<ConcurentiDetails>();
        Iterator<Concurenti> i = concurenti.iterator();

        while (i.hasNext()) {
            Concurenti concurent = (Concurenti) i.next();
            ConcurentiDetails concurentiDetails = new ConcurentiDetails(
                    concurent.getId(),
                    concurent.getNume(),
                    concurent.getPrenume(),
                    concurent.getCnp(),
                    concurent.getTelefon(),
                    concurent.getAdresa());
            detailsList.add(concurentiDetails);
        }

        return detailsList;
    }

   
    @Override
    public List<ConcurentiDetails> getAllConcurenti() {
        logger.info("getAllConcurenti");

        List<Concurenti> concurenti = null;
        try {
            concurenti = (List<Concurenti>) em.createNamedQuery(
                    "entity.Concurenti.gasesteTotiConcurenti")
                    .getResultList();

            return copyConcurentiToDetails(concurenti);
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }

    @Override
    public List<ConcurentiDetails> getConcurentiNume(String nume) {
        logger.info("getConcurentiNume");

        List<Concurenti> concurenti = null;

        try {
            concurenti = (List<Concurenti>) em.createNamedQuery(
                    "entity.Concurenti.gasesteConcurentiNume")
                    .setParameter("nume", nume)
                    .getResultList();

            return copyConcurentiToDetails(concurenti);
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }

    /**
     *
     * @param cnp
     * @return
     */
    @Override
    public List<ConcurentiDetails> getConcurentiCnp(String cnp) {
        logger.info("getConcurentiCnp");

        List<Concurenti> concurenti = null;

        try {
            concurenti = (List<Concurenti>) em.createNamedQuery(
                    "entity.Concurenti.gasesteConcurentiCnp")
                    .setParameter("cnp", cnp)
                    .getResultList();

            return copyConcurentiToDetails(concurenti);
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }


}
