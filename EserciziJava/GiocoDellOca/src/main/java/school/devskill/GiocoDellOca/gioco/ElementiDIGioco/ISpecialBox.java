package school.devskill.GiocoDellOca.gioco.ElementiDIGioco;

import school.devskill.GiocoDellOca.eccezioni.ActionNotPermitedException;

public interface ISpecialBox {

      int calculatePosition(int playerOriginalPosition) throws ActionNotPermitedException;

}

