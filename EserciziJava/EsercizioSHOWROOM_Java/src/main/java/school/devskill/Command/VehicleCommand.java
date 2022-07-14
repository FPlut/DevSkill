package school.devskill.Command;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class VehicleCommand {
    protected String nome;
    protected String marca;
    protected int annoDiProduzione;
}
