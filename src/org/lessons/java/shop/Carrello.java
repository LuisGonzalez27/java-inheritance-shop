package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        System.out.println("Benvenuto nel carello");
        Scanner scan = new Scanner(System.in);
        int itemNumber = 0;
        Prodotto[] lista = new Prodotto[5];

        boolean addItem=true;
        do {

            System.out.println("Che prodotto vuoi aggiungere? 1-Smartphone, 2-Televisore, 3-Cuffie o digita \"0\" per Uscire");
            String option= scan.nextLine();

            switch (option.toLowerCase()) {
                case "1" -> {
                    System.out.println("Inserisci nome prodotto");
                    String nome = scan.nextLine();
                    System.out.println("Inserisci descrizione prodotto");
                    String descrizione = scan.nextLine();
                    System.out.println("Inserisci prezzo prodotto");
                    double prezzo = Double.parseDouble(scan.nextLine());
                    System.out.println("Inserisci iva prodotto");
                    double iva = Double.parseDouble(scan.nextLine());
                    System.out.println("Inserisci imei prodotto");
                    String imei = scan.nextLine();
                    System.out.println("Inserisci memoria prodotto");
                    int memoria = Integer.parseInt(scan.nextLine());
                    Smartphone nuovoSmart = new Smartphone(nome, descrizione, prezzo, iva, imei, memoria);
                    lista[itemNumber] = nuovoSmart;
                    itemNumber++;
                }
                case "2" -> System.out.println("Inserisci nome prodotto");
                case "3" -> System.out.println("Inserisci nome prodotto");
                case "0" -> {
                    System.out.println("Grazie per aver aggiunto prodotti al carrello");
                    addItem = false;
                }
                default -> System.out.println("Comando non riconosciuto");
            }
        } while (addItem &&(itemNumber< lista.length));

        System.out.println("Ecco il carello: ");
        for (int i=0;i<itemNumber;i++) {
            System.out.println(lista[i].toString());
        }
    }
}
