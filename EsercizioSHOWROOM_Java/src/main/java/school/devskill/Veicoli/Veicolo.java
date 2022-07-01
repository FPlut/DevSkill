package school.devskill.Veicoli;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public abstract class Veicolo {

    protected String nome;
    protected String marca;
    protected int annoDiProduzione;
    protected double prezzo;

    public Veicolo(String nome, String marca, int annoDiProduzione, double prezzo) {
        this.nome = nome;
        this.marca = marca;
        this.annoDiProduzione = annoDiProduzione;
        this.prezzo = prezzo;
    }

    public abstract String getTipo();



}
