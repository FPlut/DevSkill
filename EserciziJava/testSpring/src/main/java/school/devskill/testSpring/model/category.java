package school.devskill.testSpring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class category {

    @Id
    @Column(name = "Name", length = 20)
    private String name;
    @Column(nullable = false, name = "Description", length = 100)
    private String desc;

}
