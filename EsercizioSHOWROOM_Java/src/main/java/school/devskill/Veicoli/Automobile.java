package school.devskill.Veicoli;


import school.devskill.Utility.GestoreUtility;

public class Automobile extends school.devskill.Veicoli.Veicolo {
    Integer cilindrata;

    public Automobile(String nome, String marca, Integer annoDiProduzione, Double prezzo, Integer cilindrata) {
        super(nome, marca, annoDiProduzione, prezzo);
        this.cilindrata = cilindrata;

    }

    @Override
    public String toString() {
        return "{ nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                "cilindrata=" + cilindrata +
                ", annoDiProduzione=" + annoDiProduzione +
                ", prezzo=" + prezzo +
                '}';
    }

    @Override
    public int getAnnoDiProduzione() {
        return super.getAnnoDiProduzione();
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Integer cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String getTipo() {return GestoreUtility.TIPO_AUTOMOBILE;}
}
