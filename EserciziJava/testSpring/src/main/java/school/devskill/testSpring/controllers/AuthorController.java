package school.devskill.testSpring.controllers;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.command.AuthorCommand;
import school.devskill.testSpring.dto.AuthorDTO;
import school.devskill.testSpring.service.interfaces.IAuthor;
import school.devskill.testSpring.utility.HTTPUtility;

@RestController
@RequestMapping(value = HTTPUtility.CONTROLLER_AUTHOR)
public class AuthorController {

    private final ObjectMapper objectMapper ;
    private final IAuthor author;

    @Autowired
    public AuthorController(ObjectMapper objectMapper, IAuthor a) {
        this.objectMapper = objectMapper;
        this.author = a;
    }
    @GetMapping(value = HTTPUtility.GET+"/{id}")
    public String getAuthor(@PathVariable int id){return "Ciao, sono un metodo che risponde ad una chiamata get, qui ci sará la risposta json con all'interno l'utenti con l'id inserito nella URI";}

    @PostMapping(value = HTTPUtility.CREATE)
    public String createAuthor(@RequestBody AuthorDTO a){return "Ciao, sono un metodo che risponde ad una chiamata CREATE";}
    @DeleteMapping(value = HTTPUtility.DELETE+"/{id}")
    public String deleteAuthor(@PathVariable("id") int id){return "Ciao, sono un metodo che risponde ad una chiamata DELETE, ritornerá un json con le info dell'author eliminato. Potrebbe anche inviare un messaggio con scritto author eliminato ";}
    @PutMapping(value = HTTPUtility.PUT)
    public String updateAuthor(/**Author a**/) {return "Ciao, sono un metodo che risponde ad una chiamata PUT(Serve per modificare una Author)";}
    @PostMapping(value = HTTPUtility.SEARCH)
    public String searchAuthor(@RequestBody AuthorCommand a){
        AuthorCommand authorCommand = null;
/**        try {
            authorCommand= objectMapper.convertValue(cercaAuthor(a.getId() ,a.getName(), a.getSurname()), AuthorCommand.class);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }finally {

            return authorCommand.toString();
        }**/

        return "Ciao, sono un metodo che risponde ad una chiamata POST, qui ci sará la risposta json con all'interno l'autore";}
}
