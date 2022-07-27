package school.devskill.testSpring.controllers;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.service.interfaces.ICategory;
import school.devskill.testSpring.utility.HTTPUtility;

@RestController
@RequestMapping(value = HTTPUtility.CONTROLLER_CATEGORY)

public class CategoryController {

    private final ObjectMapper objectMapper ;
    private final ICategory category;

    @Autowired
    public CategoryController(ObjectMapper objectMapper, ICategory c) {
        this.objectMapper = objectMapper;
        this.category = c;
    }


    @GetMapping(value = HTTPUtility.GET+"/{id}")
    public String getCategoria(@PathVariable int id){
        return "Ciao, sono un metodo che risponde ad una chiamata get, qui ci sará la risposta json con all'interno la categoria con l'id inserito nella URI";

    }
    @PostMapping(value = HTTPUtility.SEARCH)
    public String searchCategory(){return "Ciao, sono un metodo che risponde ad una chiamata POST(load categorie)qui ci sará la risposta json con all'interno la lista delle categorie";}
    @PostMapping(value = HTTPUtility.CREATE)
    public String createCategory(/** Categoria c**/){return "Ciao, sono un metodo che risponde ad una chiamata CREATE";}
    @DeleteMapping(value = HTTPUtility.DELETE+"/{id}")
    public String deleteCategory(@PathVariable("id") int id){return "Ciao, sono un metodo che risponde ad una chiamata DELETE, ritornerá un json con le info della categoria eliminata. Potrebbe anche inviare un messaggio con scritto categoria eliminata";}
    @PutMapping(value = HTTPUtility.UPDATE)
    public String updateCategory(/**Categoria c**/) {return "Ciao, sono un metodo che risponde ad una chiamata PUT(Serve per modificare una categria)";}


}
