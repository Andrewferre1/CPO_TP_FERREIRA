/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.exo3;

/**
 *
 * @author ferre
 */
public class TP2Exo3 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // 1. Création des tartiflettes
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        // 2. Assiette3 référence assiette2
        Tartiflette assiette3 = assiette2;

        // 3. Afficher les calories des tartiflettes
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // 4. Incrémenter les calories d'assiette2
        assiette2.nbCalories += 100;

        // 5. Afficher à nouveau les calories après modification
        System.out.println("Après modification :");
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // 6. Inverser les références de assiette1 et assiette2
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        // 7. Afficher les calories après inversion
        System.out.println("Après inversion des références :");
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

        // 8. Création d'un tableau de 10 Moussaka
        Moussaka[] moussakas = new Moussaka[10];

        // 9. Initialisation de chaque élément du tableau
        for (int i = 0; i < moussakas.length; i++) {
            moussakas[i] = new Moussaka(500 + i * 100);  // Différentes valeurs de calories
        }

        // 10. Afficher les calories de chaque Moussaka
        for (int i = 0; i < moussakas.length; i++) {
            System.out.println("Moussaka " + i + " contient " + moussakas[i].nbCalories + " calories.");
        }
    }
}

    

