package school.devskill.GiocoDellOca.gioco.ElementiDIGioco;

import school.devskill.GiocoDellOca.eccezioni.ActionNotPermitedException;

public class StopBox implements ISpecialBox {


    @Override
    public int calculatePosition(int playerOriginalPosition) {
        throw new ActionNotPermitedException();
    }


}
