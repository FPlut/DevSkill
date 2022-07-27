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
public class user {

    @Id
    @Column(name = "Username", length = 100)
    private String username;
    @Column(nullable = false, name = "Name", length = 100)
    private String name;
    @Column(nullable = false, name = "Surname", length = 100)
    private String surname;
    @Column(nullable = false, name = "Password", length = 100)
    private String pwd;
    @Column(nullable = false, name = "Email", length = 100)
    private String email;

}
