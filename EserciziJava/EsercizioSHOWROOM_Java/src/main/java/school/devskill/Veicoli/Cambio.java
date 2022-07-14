package school.devskill.Veicoli;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cambio {


    private Cambio.TipoCambio cambio;
    public enum TipoCambio{
        normale,
        invertito,
        automatico,
        manuale

    }
    @Override
    public String toString() {
        return "Cambio=" + cambio;
    }
}
