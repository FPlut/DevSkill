package school.devskill.theMazeGame.service.interfaces;

import school.devskill.exeption.GameisOverExeption;
import school.devskill.service.IBoardManagerService;

public interface IServiceMaze extends IBoardManagerService {
    String movePlayer(String movimento) throws GameisOverExeption;

}
