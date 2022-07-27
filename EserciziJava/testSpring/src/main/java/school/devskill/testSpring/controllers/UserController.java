package school.devskill.testSpring.controllers;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.service.interfaces.IUser;
import school.devskill.testSpring.utility.HTTPUtility;

@RestController
@RequestMapping(value = HTTPUtility.CONTROLLER_USER)
public class UserController {

    private final ObjectMapper objectMapper ;
    private final IUser user;

    @Autowired
    public UserController(ObjectMapper objectMapper, IUser u) {
        this.objectMapper = objectMapper;
        this.user = u;
    }

    @GetMapping(value = HTTPUtility.GET+"/{id}")
    public String getUser(@PathVariable int id){
        return "Ciao, sono un metodo che risponde ad una chiamata get, qui ci sará la risposta json con all'interno l'utenti con l'id inserito nella URI";

    }
    @PostMapping(value = HTTPUtility.SEARCH)
    public String searchUser(){return "Ciao, sono un metodo che risponde ad una chiamata POST(load Users) qui ci sará la risposta json con all'interno la lista degli utenti";}

    @PostMapping(value = HTTPUtility.CREATE)
    public String createUser(/**USER user**/){return "Ciao, sono un metodo che risponde ad una chiamata CREATE";}

    @DeleteMapping(value = HTTPUtility.DELETE+"/{id}")
    public String deleteUser(@PathVariable int id){return "Ciao, sono un metodo che risponde ad una chiamata DELETE, ritornerá un json con le info dell'user eliminato. Potrebbe anche inviare un messaggio con scritto utente eliminato";}

    @PutMapping(value = HTTPUtility.UPDATE)
    public String updateUser(/**USER user**/) {return "Ciao, sono un metodo che risponde ad una chiamata PUT(Serve per modificare una User)";}


}
