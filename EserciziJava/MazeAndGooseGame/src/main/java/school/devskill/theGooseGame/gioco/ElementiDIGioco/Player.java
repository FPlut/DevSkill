package school.devskill.theGooseGame.gioco.ElementiDIGioco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Player {

    private final String name;
    private int nThrow;

    private int position;
    private boolean stop;
    private int lastThrow;

    public Player(String name) {
        this.name = name;
        this.nThrow = 0;
    }
    public void addThrow(){
        this.nThrow++;
    }
}
