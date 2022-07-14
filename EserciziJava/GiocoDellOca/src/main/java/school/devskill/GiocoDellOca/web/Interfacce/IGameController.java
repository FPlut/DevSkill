package school.devskill.GiocoDellOca.web.Interfacce;

import school.devskill.GiocoDellOca.eccezioni.OngoingGameExeption;
import school.devskill.GiocoDellOca.eccezioni.NoPlayerExeption;
import school.devskill.GiocoDellOca.gioco.ElementiDIGioco.InfoPlayer;

public interface IGameController {
    String addPlayer(InfoPlayer i) throws OngoingGameExeption;
    String reset()throws NoPlayerExeption;
    String gameStatus();
    String playRound() throws NoPlayerExeption;
}
