package school.devskill.testSpring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.command.LoginCommand;
import school.devskill.testSpring.dto.UserDTO;
import school.devskill.testSpring.service.interfaces.ILogin;
import school.devskill.testSpring.utility.HTTPUtility;

@RestController
@RequestMapping(value = HTTPUtility.CONTROLLER_LOGIN)
public class LoginController {

    private final ILogin login;

    @Autowired
    public LoginController(ILogin l) {
        this.login = l;
    }
    @PostMapping(value = "/login")
    public UserDTO login(@RequestBody LoginCommand loginCommand){
        UserDTO utente = new UserDTO(9,"PaolASDASo","BiaASDASDnco","adada@Gmail.com","");
        return utente;
    }


}
