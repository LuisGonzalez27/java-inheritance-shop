package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto{
    private int codeIMEI;
    private int storage;

    public Smartphone(String nome, String descrizione, BigDecimal prezzo, int storage) {
        super(nome, descrizione, prezzo);
        Random rand = new Random();
        this.codeIMEI = rand.nextInt(100,100000);
        this.storage = storage;
    }

    public int getCodeIMEI() {
        return codeIMEI;
    }

    public void setCodeIMEI(int codeIMEI) {
        this.codeIMEI = codeIMEI;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return super.toString() + " IMEI: " + codeIMEI + " storage: " + storage + "GB";
    }
}