package school.devskill.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.Command.StampaCommand;
import school.devskill.DTO.VeicoloDTO;
import school.devskill.Utility.HTTPUtility;
import school.devskill.service.interfaces.IGestoreService;
import java.math.BigDecimal;
import java.math.RoundingMode;

@RestController
@RequestMapping(value = HTTPUtility.CONTROLLER_SHOWROOM)
public class ShowRoomController {

    private final ObjectMapper objectMapper;
    private final IGestoreService gestore;

    @Autowired
    public ShowRoomController(ObjectMapper objectMapper, IGestoreService g) {
        this.objectMapper = objectMapper;
        this.gestore = g;
    }



    @GetMapping(value = HTTPUtility.GETPREZZOMEDIO+"/{id}")
    public String getPrezzoMedio(@PathVariable int id){
        String scelta = "";
        if(id == 0){
            scelta = "dei veicoli ";
        }
        if(id == 1){
            scelta = "del motociclo ";
        }if(id == 2){
            scelta = "dell'automobile ";
        }
        BigDecimal bd = new BigDecimal(Double.toString(gestore.prezzoMedio(id)));
        bd = bd.setScale(2, RoundingMode.HALF_UP);




        return "Il prezzo medio "+scelta + "é " + bd;

    }
    @GetMapping(value = HTTPUtility.GETOLDEST+"/{id}")
    public VeicoloDTO getOldestVehicle(@PathVariable int id){
        VeicoloDTO veicoloDTO = null;
        try {
            veicoloDTO= objectMapper.convertValue(gestore.restituisciOldestVeicolo(id), VeicoloDTO.class);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        return veicoloDTO;


    }
    @GetMapping(value = HTTPUtility.GETNEWEST+"/{id}")
    public VeicoloDTO getNewestVehicle(@PathVariable int id){
        VeicoloDTO veicoloDTO = null;
        try {
            veicoloDTO= objectMapper.convertValue(gestore.restituisciNewestVeicolo(id), VeicoloDTO.class);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

            return veicoloDTO;
        }


        @PostMapping("/stampaveicolo")
        public String stampaVeicolo(@RequestBody StampaCommand command){
            VeicoloDTO veicoloDTO = null;
            try {
                veicoloDTO= objectMapper.convertValue(gestore.cercaVeicolo(command.getNome() ,command.getAnnoDiProduzione()), VeicoloDTO.class);

            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                veicoloDTO =new VeicoloDTO(); }

                return veicoloDTO.toString();

        }


}
