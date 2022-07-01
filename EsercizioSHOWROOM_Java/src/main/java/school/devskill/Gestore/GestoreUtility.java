package school.devskill.Gestore;

import school.devskill.Veicoli.Motociclo;
import school.devskill.Veicoli.MotocicloDaPista;
import school.devskill.Veicoli.Veicolo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class GestoreUtility extends Gestore{

        public static final String TIPO_AUTOMOBILE = "automobile";
        public static final String TIPO_MOTOCICLO = "motociclo";


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
