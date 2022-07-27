package school.devskill.testSpring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "Id")
    private int id;
    @Column(nullable = false, name = "Name", length = 100)
    private String name;
    @Column( name = "Description", length = 100)
    private String desc;
    @Column( name = "Image", length = 100)
    private String img;
    @Column(nullable = false, name = "Title", length = 100)
    private String title;
    @Column( name = "Dimension", length = 100)
    private String dimension;
    @Column(nullable = false,name = "Category", length = 20)
    private String catName;
    @Column(nullable = false,name = "Type", length = 100)
    private String typeName;
    @Column(nullable = false,name = "Author")
    private int authorId;

}
