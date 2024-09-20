/*
 * Andrew ferreira 
 * 
 */
package exercice4;

import java.util.Scanner;

/**
 *
 * @author ferre
 */
public class Exercice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("add");
    System.out.println("substract");
    System.out.println("multiply");
    System.out.println("divide");
    System.out.println("modulo");
    
    


    
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
    Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir un entier
    System.out.print("Entrez un entier : ");
        
        // Lire l'entier saisi par l'utilisateur et le stocker dans la variable 'operateur'
    int operateur = scanner.nextInt();
        
        // Afficher la valeur de l'entier saisi
    System.out.println("Vous avez saisi : " + operateur);
        
        // Fermer le scanner
    scanner.close();
    
    

 
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur

        
        // Demander à l'utilisateur de saisir la première valeur (opérande 1)
System.out.print("Entrez la première valeur (opérande 1) : ");
        int operande1 = scanner.nextInt();
        
        // Demander à l'utilisateur de saisir la deuxième valeur (opérande 2)
        System.out.print("Entrez la deuxième valeur (opérande 2) : ");
        int operande2 = scanner.nextInt();
        
        // Afficher les valeurs saisies
        System.out.println("Vous avez saisi : " + operande1 + " et " + operande2);
        
        // Fermer le scanner
        scanner.close();

}

        
        

    }
}

    
    
}
