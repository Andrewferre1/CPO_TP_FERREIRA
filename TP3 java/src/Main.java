/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferre
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Création de deux objets Epee
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        // Création de deux objets Baton
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        // Création d'un tableau dynamique (ArrayList) pour stocker les armes
        ArrayList<Arme> armes = new ArrayList<>();

        // Ajout des armes dans le tableau dynamique
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        // Affichage des caractéristiques de chaque arme
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i).toString());
        }
    }
}

