package org.lessons.java.shop;

public class Televisori extends Prodotto {
    boolean smartOrnOT;
    int inches;

    public Televisori(int codice, String nome, String descrizione, double prezzo, double iva) {
        super(codice, nome, descrizione, prezzo, iva);
    }
}