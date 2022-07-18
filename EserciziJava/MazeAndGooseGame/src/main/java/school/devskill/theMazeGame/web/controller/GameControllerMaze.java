package school.devskill.theMazeGame.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.devskill.exeption.GameisOverExeption;
import school.devskill.exeption.NoPlayerExeption;
import school.devskill.utility.HTTPUtility;
import school.devskill.web.controller.GameController;
import school.devskill.exeption.ActionNotPermitedException;
import school.devskill.theMazeGame.command.MoveCommand;
import school.devskill.theMazeGame.service.interfaces.IServiceMaze;
import school.devskill.theMazeGame.web.Interfacce.IGameControllerMaze;

@RestController
@RequestMapping(path = HTTPUtility.CONTROLLER_MAZE)
public class GameControllerMaze extends GameController implements IGameControllerMaze {
    @Autowired
    public GameControllerMaze(IServiceMaze boardMan, ObjectMapper o) {
        super(boardMan, o);
    }

    @Override
    @PostMapping(path = HTTPUtility.MOVE)
    public String MovePlayer(@RequestBody MoveCommand command) {
        String message ="";
        try{
            message= ((IServiceMaze)boardManager).movePlayer(command.getMove());
        }catch (ActionNotPermitedException e){
            System.out.println(e.getMessage() +"\nRisolto");
            message = e.getMessage() +"\n\n"+gameStatus();
        }catch (GameisOverExeption e){
            System.out.println(e.getMessage()+"\nRisolto");
            message ="Congratulazioni hai vinto \n\n"+gameStatus();

        }
        return message;
    }
    @Override
    @PostMapping(path = HTTPUtility.RESET)
    public String reset()  {
        String message ="";
        try {
            message = boardManager.reset();
        } catch (NoPlayerExeption e) {
            System.out.println(e.getMessage()+"\nRisolto");
            return e.getMessage();
        }
        return message;
    }
}
