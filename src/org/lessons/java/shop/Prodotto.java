package org.lessons.java.shop;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    //attributes
    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva = BigDecimal.valueOf(0.22);

    public Prodotto(String nome, String descrizione, BigDecimal prezzo) {
        Random rand = new Random();
        this.codice = rand.nextInt(1,1000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
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

    public String getDescrizione() {
        return descrizione;
    }

    public void setdescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public BigDecimal getPrezzoIva(){
        return prezzo.add(prezzo.multiply(iva).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Override
    public String toString() {
        return "Prodotto :"+ codice + ", Nome: " + nome + ", Descrizione: " + descrizione +", Prezzo: " + prezzo + ", IVA: " + iva + ", Prezzo con IVA:" + getPrezzoIva();
    }
}