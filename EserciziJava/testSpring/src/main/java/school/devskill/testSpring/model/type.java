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
public class type {

    @Id
    @Column(name = "Value", length = 100)
    private String value;
    @Column( name = "Description", length = 100)
    private String desc;

}
