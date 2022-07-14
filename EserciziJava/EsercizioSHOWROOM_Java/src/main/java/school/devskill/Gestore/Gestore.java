package school.devskill.Gestore;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import school.devskill.Veicoli.Motociclo;
import school.devskill.Veicoli.Veicolo;

import java.util.*;

public  class Gestore {
    protected static List<Veicolo> veicoli;

    public Gestore() {
        veicoli = new ArrayList<>();
    }

/** Funzione che permette di restituire il piú vecchio veicolo generico inserendo 0, moto inserendo 1 e un auto inserendo 2 **/
    public static Veicolo restituisciOldestVeicolo(){
        LocalDate current_date = LocalDate.now();
        Scanner sc = new Scanner(System.in);
         System.out.println("Inserisci 0 per veicolo piu' vecchio, 1 per vedere la piu' vecchia moto oppure 2 per la piu' vecchia auto");
        int s= sc.nextInt();
        Veicolo daTornare = null;
        switch (s) {
            case 0 -> {

                int min = current_date.getYear();

                for (int i = 0; i < veicoli.size(); i++) {
                    Veicolo v = veicoli.get(i);
                    int annoCorrente = v.getAnnoDiProduzione();

                    if (annoCorrente < min) {
                        min = annoCorrente;
                        daTornare = v;
                    }
                }
                return daTornare == null ? veicoli.get(0) : daTornare;
            }
            case 1 -> {
                int min = current_date.getYear();
                for (int i = 0; i < veicoli.size(); i++) {
                    Veicolo v = veicoli.get(i);
                    int annoCorrente = v.getAnnoDiProduzione();
                    if (v.getTipo().equals("motociclo")) {
                        if (annoCorrente < min) {
                            min = annoCorrente;
                            daTornare = v;
                        }
                    }

                }
                return daTornare == null ? veicoli.get(0) : daTornare;
            }
            case 2 -> {
                int min = current_date.getYear();
                for (int i = 0; i < veicoli.size(); i++) {
                    Veicolo v = veicoli.get(i);
                    int annoCorrente = v.getAnnoDiProduzione();
                    if (v.getTipo().equals("automobile")) {
                        if (annoCorrente < min) {
                            min = annoCorrente;
                            daTornare = v;
                        }
                    }

                }
                return daTornare == null ? veicoli.get(0) : daTornare;
            }
        }

        return daTornare;
    }
    /** Funzione che permette di restituire il piú nuovo veicolo generico inserendo 0, moto inserendo 1 e un auto inserendo 2 **/
    public static Veicolo restituisciNewestVeicolo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci 0 per veicolo piu'nuovo, 1 per vedere la piu' nuova moto oppure 2 per la piu' nuova auto");

        int s= sc.nextInt();
        Veicolo daTornare = null;
        switch (s) {
            case 0 -> {

                int max = veicoli.get(0).getAnnoDiProduzione();

                for (Veicolo veicolo : veicoli) {
                    int annoCorrente = veicolo.getAnnoDiProduzione();

                    if (annoCorrente >max) {
                        max = annoCorrente;
                        daTornare = veicolo;
                    }
                }
                return daTornare == null ? veicoli.get(0) : daTornare;
            }
            case 1 -> {
                int max = veicoli.get(0).getAnnoDiProduzione();
                for (Veicolo v : veicoli) {

                    int annoCorrente = v.getAnnoDiProduzione();
                    if (v.getTipo().equals("motociclo")) {
                        if (annoCorrente > max) {
                            max = annoCorrente;
                            daTornare = v;
                        }
                    }

                }
                return daTornare == null ? veicoli.get(0) : daTornare;
            }
            case 2 -> {
                int max =veicoli.get(0).getAnnoDiProduzione();
                for (Veicolo v : veicoli) {

                    int annoCorrente = v.getAnnoDiProduzione();
                    if (v.getTipo().equals("automobile")) {
                        if (annoCorrente > max) {
                            max = annoCorrente;
                            daTornare = v;
                        }
                    }

                }
                return daTornare == null ? veicoli.get(0) : daTornare;
            }
        }

        return daTornare;
    }

    /** Funzione che permette di restituire il piú prezzo medio di veicoli generici inserendo 0, moto inserendo 1 e auto inserendo 2 **/
    public static Double prezzoMedio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci 0 per sapere il prezzo medio dei veicoli, 1 per moto o 2 per auto");
        int s= sc.nextInt();

        double totalePrezzi = 0;
        int totaleVeicoli = 0;
        switch (s) {
            case 0 -> {

                for (Veicolo veicolo : veicoli) {
                    totalePrezzi += veicolo.getPrezzo();
                }

                return totalePrezzi / veicoli.size();
            }
            case 1 -> {

                for (Veicolo v : veicoli) {

                    if (v.getTipo().equals("motociclo")) {
                        totalePrezzi += v.getPrezzo();
                        totaleVeicoli++;
                    }

                }
                return totaleVeicoli == 0 ? 0 : totalePrezzi / totaleVeicoli;
            }



            case 2 -> {
                for (Veicolo v : veicoli) {

                    if (v.getTipo().equals("automobile")) {
                        totalePrezzi += v.getPrezzo();
                        totaleVeicoli++;
                    }

                }
                return totaleVeicoli == 0 ? 0 : totalePrezzi / totaleVeicoli;
            }

        }
        return totalePrezzi;
    }


    public void aggiungiVeicoli(List<Veicolo> daAggiungere) {
        veicoli.addAll(daAggiungere);
    }

    public void rimuoviVeicoli(List<Veicolo> daRimuovere) {
        veicoli.removeAll(daRimuovere);
    }

    public void aggingiVeicolo(Veicolo v) {
        veicoli.add(v);
    }

    public void rimuoviVeicolo(Veicolo v) {
        veicoli.remove(v);
    }
}

