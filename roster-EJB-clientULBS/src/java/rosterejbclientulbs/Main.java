/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosterejbclientulbs;

import java.util.List;
import javax.ejb.EJB;
import roster.request.Request;
import roster.util.ConcurentiDetails;
import roster.util.FacultatiDetails;
import roster.util.SpecializariDetails;
import roster.util.UseriDetails;
import roster.entity.Facultati;

/**
 *
 * @author Mada
 */
public class Main {

    @EJB
    private static Request request;

    public static void main(String[] args) {
        System.out.println();
        
        request.createConcurenti("13", "Mada", "Stan", "23948591", "0756578901","AB");
        request.createConcurenti("7", "Roxana", "Steau", "23456789", "0723456706","AB");
        request.createConcurenti("25", "Darius", "Cimpoca", "21345678", "0763456706","SB");
        request.createConcurenti("17", "Bogdan", "Mutu", "25675678", "0756456749","SB");
     
        request.createFacultati("1", "Facultatea de Inginerie");
        request.createFacultati("2", "Facultatea de Stiinte economice");
        request.createFacultati("3", "Facultatea de Medicina");
        request.createFacultati("4", "'Facultatea' de Jurnalistica");
        
        request.createSpecializari("1", "Calculatoare", "1");
        request.createSpecializari("2", "Macroeconomie", "2");
        request.createSpecializari("3", "Farmacie", "3");
        request.createSpecializari("4", "Prezentare meteo", "4");
        request.createSpecializari("5", "IT", "1");
        
        request.createUseri("1", "mada", "raluca");
        request.createUseri("2", "roxi", "ioana");
        request.createUseri("3", "darius", "lili");
        request.createUseri("4", "bogdan", "bogdan");

        System.out.println("Caut toti concurenti: ");
        List<ConcurentiDetails> listaConcurenti = request.getAllConcurenti();
        for (int i = 0; i < listaConcurenti.size(); i++) {
            System.out.println(listaConcurenti.get(i).getNume()
                    + " " + listaConcurenti.get(i).getPrenume()
                    + " " + listaConcurenti.get(i).getCnp());
        }
        

        System.out.println("Caut toti concurenti dupa cnp:");
        String cnpConcurent = "23948591";
        List<ConcurentiDetails> listaConcurenti3 = request.getConcurentiCnp(cnpConcurent);
        System.out.println("\nCaut Concurenti cu cnp-ul: " + cnpConcurent);
        if (listaConcurenti3.isEmpty()) {
            System.out.println("Concurenti nu exista");
        } else {
            for (int i = 0; i < listaConcurenti3.size(); i++) {
                System.out.println("L-am gasit, numele lui este: "
                        + " " + listaConcurenti3.get(i).getNume() + " " + listaConcurenti3.get(i).getPrenume()
                        + " cnp-ul este: "
                        + " " + listaConcurenti3.get(i).getCnp());
            }
        }        
        
    }

}
