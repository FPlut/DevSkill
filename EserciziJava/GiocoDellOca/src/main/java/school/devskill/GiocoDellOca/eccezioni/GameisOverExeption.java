package school.devskill.GiocoDellOca.eccezioni;

public class GameisOverExeption extends Exception {
    public GameisOverExeption() {
        super( "Gioco finito ");
    }
}
