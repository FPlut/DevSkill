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
public class author {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column( name = "Id")
    private int id;
    @Column(nullable = false, name = "Name", length = 20)
    private String nameAuthor;
    @Column(nullable = false, name = "Surname", length = 20)
    private String surnameAuthor;

}
