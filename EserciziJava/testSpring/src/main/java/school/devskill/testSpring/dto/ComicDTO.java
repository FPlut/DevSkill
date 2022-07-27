package school.devskill.testSpring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComicDTO {
    Integer id;
    String name;
    String Description;
    String type;
    AuthorDTO autore;
    CategoryDTO categoria;
    //String photo;


    public ComicDTO(String name, String description, String type, AuthorDTO autore, CategoryDTO categoria) {
        this.name = name;
        Description = description;
        this.type = type;
        this.autore = autore;
        this.categoria = categoria;
    }
}
