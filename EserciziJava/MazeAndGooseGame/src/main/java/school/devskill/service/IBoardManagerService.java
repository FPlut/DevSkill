package school.devskill.service;

import school.devskill.exeption.NoPlayerExeption;
import school.devskill.exeption.OngoingGameExeption;

public interface IBoardManagerService {
    String gameStatus() throws NoPlayerExeption;

    String reset() throws NoPlayerExeption, OngoingGameExeption;

}
