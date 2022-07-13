package school.devskill.Veicoli;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Veicolo {

    protected String nome;
    protected String marca;
    protected int annoDiProduzione;
    protected double prezzo;


    public abstract String getTipo();



}
