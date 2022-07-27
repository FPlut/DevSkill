package school.devskill.testSpring.controllers;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.command.ComicCommand;
import school.devskill.testSpring.dto.AuthorDTO;
import school.devskill.testSpring.dto.CategoryDTO;
import school.devskill.testSpring.dto.ComicDTO;
import school.devskill.testSpring.service.interfaces.IComic;
import school.devskill.testSpring.utility.HTTPUtility;

@RestController
@RequestMapping(value = HTTPUtility.CONTROLLER_COMIC)
public class ComicController {

    private final ObjectMapper objectMapper ;
    private final IComic comic;

    @Autowired
    public ComicController(ObjectMapper objectMapper, IComic c) {
        this.objectMapper = objectMapper;
        this.comic = c;
    }

    @GetMapping(value = HTTPUtility.GET+"/{id}")
    public String getComic(@PathVariable int id){
        //return getComicByid(id);

        return "Ciao, sono un metodo che risponde ad una chiamata get, qui ci sará la risposta json con all'interno l'utenti con l'id inserito nella URI";

    }
    @PostMapping(value = HTTPUtility.SEARCH)
    public String searchComic(){
        //return getlistComicDB()
        return "Ciao, sono un metodo che risponde ad una chiamata POST(load Comic)qui ci sará la risposta json con all'interno la lista dei fumetti";}
    @PostMapping(value = HTTPUtility.CREATE)
    public ComicDTO createComic(@RequestBody ComicCommand comic){
        AuthorDTO author = new AuthorDTO(2,"Paolo","Fox");

        CategoryDTO categoria = new CategoryDTO(2,"Fantasy","Bla bla bla" );
        //creaComic(comic.getName(),comic.getDescription(),comic.getType(),comic.getIdAuthor(),comic.getIdCategory());
        ComicDTO comic2  = new ComicDTO(comic.getName(),comic.getDescription(),comic.getType(),author,categoria);
        return comic2;}
    @DeleteMapping(value = HTTPUtility.DELETE+"/{id}")
    public String deleteComic(@PathVariable("id") int id){

        //deleteComic(id);
        //return getComic(id);
        return "Ciao, sono un metodo che risponde ad una chiamata DELETE, ritornerá un json con le info dell'comic eliminato. Potrebbe anche inviare un messaggio con scritto comic eliminato";}
    @PutMapping(value = HTTPUtility.UPDATE)
    public ComicDTO updateComic(@RequestBody ComicCommand comic) {
        AuthorDTO author = new AuthorDTO(2,"Paolo","Fox");

        CategoryDTO categoria = new CategoryDTO(2,"Fantasy","Bla bla bla" );
        ComicDTO comic2  = new ComicDTO(comic.getId(), comic.getName(),comic.getDescription(),comic.getType(),author,categoria);
        //updateComic(comic.getId(),comic.getName(),comic.getDescription(),comic.getType(),comic.getIdAuthor(),comic.getIdCategory());
        return comic2;}


}
