/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.exo3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ferre
 */
public class Tp1Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Random generateurAleat = new Random(); 
    
    
    int n = generateurAleat.nextInt(100); 
    
    
    
    
    Scanner sc = new Scanner(System.in);
    
    int nbr1;
    nbr1 =sc.nextInt();
    
    int compt=0;
    
    
    System.out.println("Devinez un nombre entre 0 et 100 : ");
    
    
    
    
    while (nbr1!=n){
        nbr1 =sc.nextInt();
        
    compt+= 1;
        
        
    if (nbr1<n){
        System.out.print("Trop petit");
    }
    if(nbr1==n){
        System.out.print("Bravo vous avez gagne en ");
        System.out.print(  compt);
    }
    
    if(nbr1>n){
        System.out.print("Trop grand");
    }   
    }
    } 
}
