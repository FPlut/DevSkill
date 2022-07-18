package school.devskill.theGooseGame.gioco.ElementiDIGioco;

import school.devskill.exeption.ActionNotPermitedException;

public class StopBox implements ISpecialBox {


    @Override
    public int calculatePosition(int playerOriginalPosition) {
        throw new ActionNotPermitedException("Azione non permessa");
    }


}
