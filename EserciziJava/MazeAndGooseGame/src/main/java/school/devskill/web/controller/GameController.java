package school.devskill.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import school.devskill.service.IBoardManagerService;
import school.devskill.utility.HTTPUtility;
import school.devskill.web.interfaces.IGameController;
import school.devskill.exeption.NoPlayerExeption;

@RestController
public abstract class GameController implements IGameController {
    protected final IBoardManagerService boardManager;
    protected final ObjectMapper micheal;

    @Autowired
    public GameController(IBoardManagerService boardManager, ObjectMapper micheal) {
        this.boardManager = boardManager;
        this.micheal = micheal;
    }

    @Override
    @PostMapping(HTTPUtility.RESET)
    public String reset()  {
        try {
            return boardManager.reset();
        } catch (NoPlayerExeption e) {
            System.out.println(e.getMessage()+ "\n Risolto");
            return e.getMessage();
        }
    }

    @Override
    @GetMapping(HTTPUtility.GAMESTATUS)
    public String gameStatus() {
        try{
            return boardManager.gameStatus();}
        catch (NoPlayerExeption e ){
            return e.getMessage();
        }
    }
}
