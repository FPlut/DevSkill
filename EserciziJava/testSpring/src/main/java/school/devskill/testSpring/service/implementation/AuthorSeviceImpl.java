package school.devskill.testSpring.service.implementation;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import school.devskill.testSpring.service.interfaces.IAuthor;

@Service("Author")
@Getter
@Setter
public class AuthorSeviceImpl implements IAuthor {
}
