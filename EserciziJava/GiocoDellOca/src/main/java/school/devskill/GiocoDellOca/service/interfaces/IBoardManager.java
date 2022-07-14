package school.devskill.GiocoDellOca.service.interfaces;

import school.devskill.GiocoDellOca.eccezioni.GameisOverExeption;
import school.devskill.GiocoDellOca.gioco.ElementiDIGioco.InfoPlayer;
import school.devskill.GiocoDellOca.gioco.ElementiDIGioco.Player;
import school.devskill.GiocoDellOca.eccezioni.OngoingGameExeption;
import school.devskill.GiocoDellOca.eccezioni.NoPlayerExeption;

public interface  IBoardManager {
    String gameStatus();
    void playRound() throws NoPlayerExeption, GameisOverExeption;
    String addPlayer(Player p) throws OngoingGameExeption;
    void reset() throws NoPlayerExeption;
    String winner();
}
