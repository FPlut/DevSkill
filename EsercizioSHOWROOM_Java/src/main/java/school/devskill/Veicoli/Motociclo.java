package school.devskill.Veicoli;


import lombok.Getter;
import lombok.Setter;
import school.devskill.Utility.GestoreUtility;

@Getter
@Setter
public class Motociclo extends school.devskill.Veicoli.Veicolo {
    String edizioneLimitata;


    public Motociclo(String nome, String marca, Integer annoDiProduzione, Double prezzo) {
        super(nome, marca, annoDiProduzione, prezzo);
    }
    public Motociclo(String nome, String marca, Integer annoDiProduzione, Double prezzo,String edizioneLimitata) {
        super(nome, marca, annoDiProduzione, prezzo);
        this.edizioneLimitata = edizioneLimitata;
    }

    @Override
    public String toString() {
        return "{ nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", edizioneLimitata=" + edizioneLimitata +
                ", annoDiProduzione=" + annoDiProduzione +
                ", prezzo=" + prezzo +'}';
    }



    @Override
    public String getTipo() {
        return GestoreUtility.TIPO_MOTOCICLO;
    }
}
