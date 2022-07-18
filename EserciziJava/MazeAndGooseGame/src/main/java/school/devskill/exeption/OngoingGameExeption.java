package school.devskill.exeption;

public class OngoingGameExeption extends Exception {

    public OngoingGameExeption() {
        super("azione non permessa, gioco in corso!");
    }
}
