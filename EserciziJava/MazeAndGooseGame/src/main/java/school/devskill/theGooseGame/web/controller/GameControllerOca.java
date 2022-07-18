package school.devskill.theGooseGame.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.web.controller.GameController;
import school.devskill.exeption.GameisOverExeption;
import school.devskill.theGooseGame.gioco.ElementiDIGioco.Player;
import school.devskill.theGooseGame.service.interfaces.IServiceGoose;
import school.devskill.utility.HTTPUtility;
import school.devskill.theGooseGame.web.Interfacce.IGameControllerOca;
import school.devskill.exeption.OngoingGameExeption;
import school.devskill.exeption.NoPlayerExeption;
import school.devskill.theGooseGame.gioco.ElementiDIGioco.InfoPlayer;

@RestController
@RequestMapping(HTTPUtility.CONTROLLER_GOOSE)
public class GameControllerOca extends GameController implements IGameControllerOca {



    @Autowired
    public GameControllerOca(IServiceGoose boardManager, ObjectMapper o) {
        super(boardManager,o);
    }

    @PostMapping(HTTPUtility.ADDPLAYER)

    public String addPlayer(@RequestBody InfoPlayer i) {
        String message = "";
        try {
            message = ((IServiceGoose) boardManager).addPlayer(micheal.convertValue(i, Player.class));
        } catch (OngoingGameExeption e) {
            System.out.println("Risolto!");
            return e.getMessage();
        }
        return message;

    }

    @PostMapping(HTTPUtility.PLAYROUND)

    public String playRound() throws NoPlayerExeption {
        String message = "";
        try {
            ((IServiceGoose)boardManager).playRound();
        } catch (NoPlayerExeption e) {

            System.out.println(e.getMessage()+"\nRisolto!");
        } catch (GameisOverExeption e) {
            e.printStackTrace();
            System.out.println(e.getMessage()+"\nRisolto!");
            return ((IServiceGoose)boardManager).winner();
        }
        return boardManager.gameStatus();
    }

}