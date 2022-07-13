package school.devskill.DTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import school.devskill.Veicoli.Cambio;
import school.devskill.Veicoli.Gomme;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class VeicoloDTO {
    private String nome;
    private String marca;
    private int annoProd;
    private double prezzo;
    @JsonProperty("limitata")
    private String edizioneLimitata;
    private Integer cilindrata;
    private Gomme.TipoGomme gomme;
    private Cambio.TipoCambio cambio;

}
