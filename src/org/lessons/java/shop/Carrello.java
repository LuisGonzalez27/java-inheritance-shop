package org.lessons.java.shop;

import java.util.Scanner;
import java.math.BigDecimal;
import java.util.Arrays;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sceltaOggetto;
        String nomeProdotto;
        String descrizione;
        BigDecimal prezzo;

        System.out.println("Benvenuto nel carello");
        System.out.println("Quanti oggetti vuoi comprare?");
        int quantita = Integer.parseInt(scan.nextLine());
        String[] cart = new String[quantita];

        for(int i = 0; i < quantita; i++){
            System.out.println("Che prodotto vuoi aggiungere? 1-Smartphone, 2-Televisore, 3-Cuffie");
            sceltaOggetto = Integer.parseInt(scan.nextLine());
            if (sceltaOggetto == 1){
                System.out.println("Inserisci nome prodotto");
                nomeProdotto = scan.nextLine();
                System.out.println("Inserisci descrizione prodotto");
                descrizione = scan.nextLine();
                System.out.println("Inserisci prezzo prodotto");
                prezzo = new BigDecimal(scan.nextLine());
                System.out.println("Inserisci memoria prodotto");
                int memoria = Integer.parseInt(scan.nextLine());
                Smartphone smartphone = new Smartphone(nomeProdotto, descrizione ,prezzo,memoria);
                cart[i] = String.valueOf(smartphone);
            } else if (sceltaOggetto == 2){
                System.out.println("Inserisci nome prodotto");
                nomeProdotto = scan.nextLine();
                System.out.println("Inserisci descrizione prodotto");
                descrizione = scan.nextLine();
                System.out.println("Inserisci prezzo prodotto");
                prezzo = new BigDecimal(scan.nextLine());
                System.out.println("Inserisci dimensione prodotto");
                int dimensione = Integer.parseInt(scan.nextLine());
                System.out.println("Inserisci se è smart o no ?");
                boolean smartOrNot = scan.nextLine().equalsIgnoreCase("si");
                Televisori televisori = new Televisori(nomeProdotto, descrizione ,prezzo, dimensione, smartOrNot);
                cart[i] = String.valueOf(televisori);

            } else if (sceltaOggetto == 3){
                System.out.println("Inserisci nome prodotto");
                nomeProdotto = scan.nextLine();
                System.out.println("Inserisci descrizione prodotto");
                descrizione = scan.nextLine();
                System.out.println("Inserisci prezzo prodotto");
                prezzo = new BigDecimal(scan.nextLine());
                System.out.println("Inserisci colore");
                String colore = scan.nextLine();
                System.out.println("Inserisci se sono wireles ?");
                boolean wirelessOrNot = scan.nextLine().equalsIgnoreCase("si");
                Cuffie cuffie = new Cuffie(nomeProdotto, descrizione, prezzo, colore, wirelessOrNot);
                cart[i] = String.valueOf(cuffie);

            } else {
                System.out.println("Comando non riconosciuto, riprova");
            }
        }
        scan.close();
        System.out.println(Arrays.toString(cart));
    }
}
