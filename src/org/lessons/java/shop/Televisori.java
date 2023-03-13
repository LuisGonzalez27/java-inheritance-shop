package org.lessons.java.shop;

import java.math.BigDecimal;
public class Televisori extends Prodotto {

    private int dimensione;
    private boolean smartOrNot;


    public Televisori(String nome, String descrizione, BigDecimal prezzo, int dimensione,  boolean smartOrNot) {
        super(nome, descrizione, prezzo);
        this.dimensione = dimensione;
        this.smartOrNot = smartOrNot;
    }
    public int getDimensione() {
        return dimensione;
    }

    public void setDimensione(int storage) {
        this.dimensione = storage;
    }

    public boolean smartOrNot() {
        return smartOrNot;
    }

    public void smartOrNot(boolean smartOrNot) {
        this.smartOrNot = smartOrNot;
    }

    @Override
    public String toString() {
        return super.toString() +" Dimensione: " + dimensione + " pollici." + " Smart: " + (smartOrNot ? "Si" : "No");
    }
}