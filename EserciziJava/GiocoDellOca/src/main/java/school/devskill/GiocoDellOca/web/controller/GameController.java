package school.devskill.GiocoDellOca.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.GiocoDellOca.eccezioni.GameisOverExeption;
import school.devskill.GiocoDellOca.gioco.ElementiDIGioco.Player;
import school.devskill.GiocoDellOca.utility.HTTPUtility;
import school.devskill.GiocoDellOca.web.Interfacce.IGameController;
import school.devskill.GiocoDellOca.eccezioni.OngoingGameExeption;
import school.devskill.GiocoDellOca.eccezioni.NoPlayerExeption;
import school.devskill.GiocoDellOca.service.interfaces.IBoardManager;
import school.devskill.GiocoDellOca.gioco.ElementiDIGioco.InfoPlayer;

@RestController
@RequestMapping(HTTPUtility.CONTROLLER_OCA)
public class GameController implements IGameController {
    private final IBoardManager boardManager;
    private final ObjectMapper micheal;

    @Autowired
    public GameController(IBoardManager boardManager, ObjectMapper o) {
        this.boardManager = boardManager;
        this.micheal = o;
    }

    @PostMapping(HTTPUtility.ADDPLAYER)
    @Override
    public String addPlayer(@RequestBody InfoPlayer i) {
        String message = "";
        try {
            message = boardManager.addPlayer(micheal.convertValue(i, Player.class));
        } catch (OngoingGameExeption e) {
            e.printStackTrace();
            System.out.println("Risolto!");
        }
        return message;

    }

    @PostMapping(HTTPUtility.RESET)
    @Override
    public String reset() {
        try {

            boardManager.reset();
        } catch (NoPlayerExeption e) {
            e.printStackTrace();
            System.out.println("Risolto!");
        }

        return "Gioco resettato";
    }

    @GetMapping(HTTPUtility.GAMESTATUS)
    @Override
    public String gameStatus() {
        return boardManager.gameStatus();

    }

    @PostMapping(HTTPUtility.PLAYROUND)
    @Override
    public String playRound() {
        String message = "";
        try {
            boardManager.playRound();
        } catch (NoPlayerExeption e) {
            e.printStackTrace();
            System.out.println("Risolto!");
        } catch (GameisOverExeption e) {
            e.printStackTrace();
            System.out.println("Risolto!");
            return boardManager.winner();
        }
        return boardManager.gameStatus();
    }
}