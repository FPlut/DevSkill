package school.devskill.theGooseGame.service.interfaces;

import school.devskill.exeption.GameisOverExeption;
import school.devskill.exeption.NoPlayerExeption;
import school.devskill.exeption.OngoingGameExeption;
import school.devskill.theGooseGame.gioco.ElementiDIGioco.Player;
import school.devskill.service.IBoardManagerService;

public interface IServiceGoose extends IBoardManagerService {
    void playRound() throws NoPlayerExeption, GameisOverExeption;
    String addPlayer(Player p) throws OngoingGameExeption;
     String winner();
}
