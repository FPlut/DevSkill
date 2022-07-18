package school.devskill.theGooseGame.gioco.ElementiDIGioco;

import school.devskill.exeption.ActionNotPermitedException;

public interface ISpecialBox {

      int calculatePosition(int playerOriginalPosition) throws ActionNotPermitedException;

}

