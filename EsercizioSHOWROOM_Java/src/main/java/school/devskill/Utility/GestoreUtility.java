package school.devskill.Utility;

import school.devskill.Veicoli.*;
import school.devskill.service.implementation.GestoreServiceImpl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestoreUtility extends GestoreServiceImpl {

        public static final String TIPO_AUTOMOBILE = "automobile";
        public static final String TIPO_MOTOCICLO = "motociclo";

        public static void InserisciVeicoli(GestoreServiceImpl g) {
                List<Veicolo> daInserire = new ArrayList<>();

                List<String> marche = new ArrayList<>(Arrays.asList("Fiat", "Mercedes", "Mv Agusta", "Ferrari", "BMW", "Yamaha","Yamaha"));
                List<String> nomi = new ArrayList<>(Arrays.asList("Punto", "Classe A", "Brutale", "Testarosse", "M3", "Tracer","Tracer2"));
                List<Integer> annoProd = new ArrayList<>(Arrays.asList(2000, 2017, 2022, 1989, 1995, 2010,2020));
                List<Double> prezzo = new ArrayList<>(Arrays.asList(10000.32, 14200.32, 40000.32, 60301.00, 100000.32, 100.00,10333.20));
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
         /**
         * Funzione che permette di applicare uno sconto o un sovrapprezzo dei veicoli in base alle proprietá speciali che hanno, per le auto se hanno più di 10 anni (sconto 15 percento)
         * per le moto se sono da pista(+15%) edizione limitata (+25% ) o entrambi (15%+25%)
         **/
        public static void calcolaSconto(){
                LocalDate current_date = LocalDate.now();
                for (Veicolo v : veicoli) {
                        if (v.getTipo().equals("automobile") && (current_date.getYear()-v.getAnnoDiProduzione())>10) {
                                BigDecimal bd = new BigDecimal(Double.toString(v.getPrezzo()-((v.getPrezzo()*0.15))));
                                bd = bd.setScale(2, RoundingMode.HALF_UP);
                                v.setPrezzo(bd.doubleValue());
                        }

                }
                for (Veicolo v : veicoli) {

                        if (v.getTipo().equals("motociclo")) {
                                if(v instanceof MotocicloDaPista && ((MotocicloDaPista) v).getEdizioneLimitata() != null){
                                        BigDecimal bd = new BigDecimal(Double.toString((v.getPrezzo()+((v.getPrezzo()*0.15)+(v.getPrezzo()*0.25)))));
                                        bd = bd.setScale(2, RoundingMode.HALF_UP);
                                        v.setPrezzo(bd.doubleValue());
                                        continue;
                                }
                                if(v instanceof MotocicloDaPista){
                                        BigDecimal bd = new BigDecimal(Double.toString(v.getPrezzo()+(v.getPrezzo()*0.15)));
                                        bd = bd.setScale(2, RoundingMode.HALF_UP);
                                        v.setPrezzo(bd.doubleValue());
                                        continue;
                                }
                                if(((Motociclo) v).getEdizioneLimitata() != null){
                                        BigDecimal bd = new BigDecimal(Double.toString(v.getPrezzo()+((v.getPrezzo()*0.25))));
                                        bd = bd.setScale(2, RoundingMode.HALF_UP);
                                        v.setPrezzo(bd.doubleValue());
                                }

                        }

                }
        }



}
