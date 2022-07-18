package school.devskill.exeption;

public class ActionNotPermitedException extends RuntimeException{
    public ActionNotPermitedException(String message) {
        super(message);
    }
}
