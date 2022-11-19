/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

/**
 *
 * @author maato
 */
public class TD_MAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Employe e1 = new Employe(25365689,"2A23","yacine","kkhouini");
        Employe e2 = new Employe(55985645,"3A23","mùajd","tepsi");
        Employe e3 = new Employe(45867465,"3A23","fasko","maatoug");
        
        Departement d1 = new Departement(1,"Twin");
        Departement d2 = new Departement(2,"Busniss");
        Departement d3 = new Departement(3,"Slim");
        
        SocieteHashMap s = new SocieteHashMap();
        
        s.ajouterEmployeDepartement(e1, d1);
        s.ajouterEmployeDepartement(e2, d2);
        s.ajouterEmployeDepartement(e3, d3);
        System.out.println("************************");
                
                
        s.afficherLesDepartements();
        System.out.println("************************");
        s.afficherLesEmployes();
        System.out.println("************************");
        s.afficherLesEmployesLeursDepartements();
                
        
        
        SocieteTreeMap t = new SocieteTreeMap();
        t.ajouterEmployeDepartement(e3, d3);
        t.ajouterEmployeDepartement(e1, d1);
        t.ajouterEmployeDepartement(e2, d2);
        System.out.println("************************");
        t.afficherLesEmployes();
    }
    
}
