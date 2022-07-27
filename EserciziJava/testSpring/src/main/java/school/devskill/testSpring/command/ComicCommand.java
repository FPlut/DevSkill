package school.devskill.testSpring.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComicCommand {
    Integer id;
    String name;
    String Description;
    String type;
    Integer idAuthor;
    Integer idCategory;
    //String photo;


    public ComicCommand( String name, String description, String type, Integer idAuthor, Integer idCategory) {

        this.name = name;
        Description = description;
        this.type = type;
        this.idAuthor = idAuthor;
        this.idCategory = idCategory;
    }
}
