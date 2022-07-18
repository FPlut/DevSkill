package school.devskill.exeption;

public class GameisOverExeption extends RuntimeException {
    public GameisOverExeption(String message) {
        super( message);
    }
}
