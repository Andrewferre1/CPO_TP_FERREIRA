/*
 * Click Andrew ferreira
 * Click 11/10/2024
 */
package tp2.exo1;

/**
 *
 * @author ferre
 */
public class Tp2Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 
7.0 ,"Dubuisson") ;     
        
        
BouteilleBiere uneBiere = new BouteilleBiere() ;

uneBiere.lireEtiquette();

uneBiere.ouvert= false;


BouteilleBiere unesecondeBiere = new BouteilleBiere();
unesecondeBiere.nom ="lefe";
unesecondeBiere.degreAlcool=6.6;
unesecondeBiere.brasserie= "Abbaye de leffe";      
        
        
    }
    
}
