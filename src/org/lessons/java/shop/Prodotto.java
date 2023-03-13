package org.lessons.java.shop;

import java.util.Random;
import java.text.DecimalFormat;

public class Prodotto {
    //attributes
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    public Prodotto(int codice, String nome, String descrizione, double prezzo, double iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.codice = codice;
    }
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.codice = Integer.parseInt(getId());
    }

    public String getNome() {
        return nome;
    }

    public int getCodice() {
        return codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getdescrizione() {
        return descrizione;
    }

    public void setdescrizione(String marca) {
        this.descrizione = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String prezzoFormattato() {
        DecimalFormat df = new DecimalFormat("0.00 EUR");
        double prezzoFinale = prezzo+((prezzo/100)*iva);
        return df.format(prezzoFinale);
    }

    protected static String getId() {

        String idString ="";
        Random rn = new Random();
        for (int i = 0;i<5;i++) {
            idString += rn.nextInt(10);
        }
        return idString;
    }

    @Override
    public String toString() {
        return "Prodotto :"+ codice + ", Nome: " + nome + ", Descrizione: " + descrizione +", Prezzo :" + prezzoFormattato();
    }
}