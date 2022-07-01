package school.devskill;
import school.devskill.Gestore.Gestore;
import school.devskill.Gestore.GestoreUtility;
import school.devskill.Veicoli.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShowRoom{
    public static void main(String[] args) {
        Gestore g = new Gestore();
        InserisciVeicoli(g);
        //Prezzo medio
        System.out.printf("%.2f%n",Gestore.prezzoMedio());
        System.out.printf("%.2f%n",Gestore.prezzoMedio());
        System.out.printf("%.2f%n",Gestore.prezzoMedio());
        //Veicolo più nuovo
        System.out.println(Gestore.restituisciNewestVeicolo());
        System.out.println(Gestore.restituisciNewestVeicolo());
        System.out.println(Gestore.restituisciNewestVeicolo());
        //Veicolo più vecchio
        System.out.println(Gestore.restituisciOldestVeicolo());
        System.out.println(Gestore.restituisciOldestVeicolo());
        System.out.println(Gestore.restituisciOldestVeicolo());
    }
    /** Funzione per velocizzare l'inserimento dei veicoli e la prova del funzionamento dell`app**/
    private static void InserisciVeicoli(Gestore g) {
        List<Veicolo> daInserire = new ArrayList<>();

        List<String> marche = new ArrayList<>(Arrays.asList("Fiat", "Mercedes", "Mv Agusta", "Ferrari", "BMW", "Yamaha","Yamaha"));
        List<String> nomi = new ArrayList<>(Arrays.asList("Punto", "Classe A", "Brutale", "Testarosse", "M3", "Tracer","Tracer2"));
        List<Integer> annoProd = new ArrayList<>(Arrays.asList(2000, 2017, 2022, 1989, 1995, 2010,2020));
        List<Double> prezzo = new ArrayList<>(Arrays.asList(10000.32, 14200.32, 40000.32, 60301.00, 100000.32, 8000.00,10333.20));
        List<Integer> cilindrate = new ArrayList<>(Arrays.asList(1000, 1600, 0, 3000, 1900, 0,0));



        for (int i = 0; i < marche.size(); i++) {

            Veicolo veicolo;

            if (i == 2 || i == 5|| i==6) {
                Motociclo moto = new Motociclo(nomi.get(i), marche.get(i), annoProd.get(i), prezzo.get(i));
                MotocicloDaPista motoDaPista = new MotocicloDaPista(nomi.get(i), marche.get(i), annoProd.get(i), prezzo.get(i), Gomme.TipoGomme.medieAsciutto, Cambio.TipoCambio.invertito);
                if (i == 2) {
                    motoDaPista.setDaPista(Gomme.TipoGomme.dureAsciutto, Cambio.TipoCambio.normale);
                    veicolo = motoDaPista;
                }else if(i==6){
                    moto.setEdizioneLimitata("si");

                    veicolo = moto;
                }else {
                    motoDaPista.setEdizioneLimitata("si");
                    veicolo = motoDaPista;
                }
            } else {

                veicolo = new Automobile(nomi.get(i), marche.get(i), annoProd.get(i), prezzo.get(i), cilindrate.get(i));

            }

            daInserire.add(veicolo);
        }
        g.aggiungiVeicoli(daInserire);
        GestoreUtility.calcolaSconto();
    }
}
