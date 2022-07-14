package school.devskill.GiocoDellOca.eccezioni;

public class ActionNotPermitedException extends RuntimeException{
    public ActionNotPermitedException() {
        super("Aione non permessa");
    }
}
