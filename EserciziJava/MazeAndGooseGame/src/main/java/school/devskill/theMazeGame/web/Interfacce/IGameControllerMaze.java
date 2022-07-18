package school.devskill.theMazeGame.web.Interfacce;

import school.devskill.web.interfaces.IGameController;
import school.devskill.theMazeGame.command.MoveCommand;

public interface IGameControllerMaze extends IGameController {
    String MovePlayer(MoveCommand command);}
