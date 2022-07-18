package school.devskill.theGooseGame.web.Interfacce;

import school.devskill.exeption.NoPlayerExeption;
import school.devskill.exeption.OngoingGameExeption;
import school.devskill.theGooseGame.gioco.ElementiDIGioco.InfoPlayer;
import school.devskill.web.interfaces.IGameController;

public interface IGameControllerOca extends IGameController {
    String addPlayer(InfoPlayer i) throws OngoingGameExeption;
    String playRound() throws NoPlayerExeption;
}
