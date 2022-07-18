package school.devskill.theGooseGame.gioco.ElementiDIGioco;

public class NumericBox implements ISpecialBox {

    private final int imprevisto;

    public NumericBox(int imprevisto) {
        this.imprevisto = imprevisto;
    }



    @Override
    public int calculatePosition(int playerOriginalPosition) {
        return imprevisto == 0 ? 0 : playerOriginalPosition + imprevisto;
    }
}
