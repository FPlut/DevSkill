package school.devskill.GiocoDellOca.eccezioni;

public class NoPlayerExeption extends Exception {
    public NoPlayerExeption() {
        super("Non ci sono player nella partita");
    }
}
