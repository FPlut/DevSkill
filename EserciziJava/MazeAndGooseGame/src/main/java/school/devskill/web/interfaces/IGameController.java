package school.devskill.web.interfaces;

import school.devskill.exeption.NoPlayerExeption;

public interface IGameController {

    String reset()throws NoPlayerExeption;
    String gameStatus();

}
