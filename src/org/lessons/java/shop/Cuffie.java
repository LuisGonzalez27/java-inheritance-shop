package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    private String colore;
    private boolean wirelessOrNot;

    public Cuffie(String nome, String descrizione, BigDecimal prezzo, String colore, boolean wirelessOrNot) {
        super(nome, descrizione, prezzo);
        this.colore = colore;
        this.wirelessOrNot = wirelessOrNot;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean wirelessOrNot() {
        return wirelessOrNot;
    }

    public void setwirelessOrNot(boolean wirelessOrNot) {
        this.wirelessOrNot = wirelessOrNot;
    }

    @Override
    public String toString() {
        return super.toString() + "- colore: " + colore + "- connettività: " + (wirelessOrNot ? "wireless" : "cablate");
    }
}