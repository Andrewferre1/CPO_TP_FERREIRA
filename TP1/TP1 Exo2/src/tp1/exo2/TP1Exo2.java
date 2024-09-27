/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.exo2;

import java.util.Scanner;

/**
 *
 * @author ferre
 */
public class TP1Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    double var1;
    
        
    Scanner sc = new Scanner(System.in);
    var1 =sc.nextDouble();
        
    System.out.println(var1+273);
        
         
    }
    

    
    
    
    
    
    
    
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    // Méthode qui convertit Kelvin vers Celsius
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    // Méthode qui convertit Fahrenheit vers Celsius
    public static double FarenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Méthode qui convertit Celsius vers Fahrenheit
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    // Méthode qui convertit Kelvin vers Fahrenheit
    public static double KelvinVersFarenheit(double tKelvin) {
        // On passe par la conversion Kelvin -> Celsius, puis Celsius -> Fahrenheit
        double tCelcius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(tCelcius);
    
    }
}
