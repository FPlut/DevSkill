package school.devskill.Veicoli;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Gomme {
    private TipoGomme gomma;
    public enum TipoGomme{
        morbideBagnato,
        morbideAsciutto,
        dureBagnato,
        dureAsciutto,
        medieBagnato,
        medieAsciutto

    }


    @Override
    public String toString() {
        return "Gomme{" +
                "Gomma=" + gomma +
                '}';
    }
}
