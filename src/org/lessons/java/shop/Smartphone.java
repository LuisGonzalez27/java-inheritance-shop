package org.lessons.java.shop;

public class Smartphone extends Prodotto{
    String imei;
    int memoria;

    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, String imei, int memory) {
        super(codice, nome, marca, prezzo, iva);
        this.imei=imei;
        memoria=memory;
    }
    public Smartphone(String nome, String marca, double prezzo, double iva, String imei, int memory) {
        super(nome, marca, prezzo, iva);
        this.imei=imei;
        memoria=memory;
    }

    public String getImei() {
        return imei;
    }

    public int getGbRam() {
        return memoria;
    }

    @Override
    public String toString() {
        return "Smartphone. " + super.toString() +
                ". Imei '" + imei + "'" +
                " con " + memoria +
                "gb";
    }
}