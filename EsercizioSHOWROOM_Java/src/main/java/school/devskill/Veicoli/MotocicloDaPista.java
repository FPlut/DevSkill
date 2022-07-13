package school.devskill.Veicoli;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
@Getter
@Setter

public class MotocicloDaPista extends Motociclo{

    Gomme.TipoGomme gomme;
    Cambio.TipoCambio cambio;

    public MotocicloDaPista(String nome, String marca, Integer annoDiProduzione, Double prezzo, Gomme.TipoGomme tG,Cambio.TipoCambio tC) {
        super(nome, marca, annoDiProduzione, prezzo);
        setDaPista(tG,tC);
    }

    public MotocicloDaPista(String nome, String marca, Integer annoDiProduzione, Double prezzo,Gomme.TipoGomme tG,Cambio.TipoCambio tC, String edizioneLimitata) {
        super(nome, marca, annoDiProduzione, prezzo, edizioneLimitata);
        setDaPista(tG,tC);
    }
/** Funzione che permette sia l'inserimeno delle gomme che per controllare se i parametri inseriti sono contenyti nell'enum Gomme e Cambio **/
    public void setDaPista(Gomme.TipoGomme t,Cambio.TipoCambio c) {
        HashSet<Gomme.TipoGomme> values = new HashSet<>();
        for (Gomme.TipoGomme gt : Gomme.TipoGomme.values()) {
            values.add(Gomme.TipoGomme.valueOf(gt.name()));
            if(values.contains(Gomme.TipoGomme.valueOf(gt.name()))){
                this.gomme = t;
                break;
            }
        }

        HashSet<Cambio.TipoCambio> values2 = new HashSet<>();
        for (Cambio.TipoCambio ct : Cambio.TipoCambio.values()) {
            values2.add(Cambio.TipoCambio.valueOf(ct.name()));
            if(values2.contains(Cambio.TipoCambio.valueOf(ct.name()))){
                this.cambio = c;
                break;
            }
        }
    }
}
