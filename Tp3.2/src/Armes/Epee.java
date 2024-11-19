package Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferre
 */


public class Epee extends Arme {
    private int indiceFinesse;

    public Epee(String nom, int niveauAttaque, int indiceFinesse) {
        super(nom, niveauAttaque);
        this.indiceFinesse = indiceFinesse;
    }

    public int getIndiceFinesse() {
        return indiceFinesse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Finesse: " + indiceFinesse;
    }
}

