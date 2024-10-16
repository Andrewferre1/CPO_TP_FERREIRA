/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.exo1;

/**
 *
 * @author ferre
 */
public class BouteilleBiere {
String nom;
double degreAlcool;
String brasserie;
boolean ouvert;

public void lireEtiquette() { 
System.out.println("Bouteille de " + nom +" (" + degreAlcool + 
" degres) \nBrasserie : " + brasserie ) ; 
}
}
