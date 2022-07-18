package school.devskill.theGooseGame.service.implementation;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import school.devskill.exeption.GameisOverExeption;
import school.devskill.exeption.OngoingGameExeption;
import school.devskill.theGooseGame.gioco.ElementiDIGioco.StopBox;
import school.devskill.theGooseGame.gioco.ElementiDIGioco.NumericBox;
import school.devskill.theGooseGame.gioco.ElementiDIGioco.ISpecialBox;
import school.devskill.theGooseGame.gioco.ElementiDIGioco.Player;
import school.devskill.exeption.ActionNotPermitedException;
import school.devskill.exeption.NoPlayerExeption;
import school.devskill.theGooseGame.service.interfaces.IServiceGoose;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Getter
@Setter
@Service("GooseService")
public class ServiceGooseImpl implements IServiceGoose {

    private List<Player> players;
    private List<ISpecialBox> boxes;
    private final int sizeBoard = 14;
    private boolean isOver = false;
    private boolean onGoing;
    private String winner;
    
    public ServiceGooseImpl() {
        this.players = new ArrayList<>();
        this.boxes = new ArrayList<>();
        createBoard();
        onGoing = false;

    }
    public String winner(){
        return winner;
    }
    @Override
    public String gameStatus() throws NoPlayerExeption {
        if(players.size()==0){
            throw new NoPlayerExeption("Non sono stati aggiunti giocatori.");
        }
        return players.toString();
    }
    public String addPlayer(Player p ) throws OngoingGameExeption {
        if(onGoing){
            throw new OngoingGameExeption();
        }
        players.add(p);
        return "Giocatore "+ p.getName()+ " aggiunto";
    }


    private int diceThrow()  {
        Random random = new Random();
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        return random.nextInt(7-1) + 1;
    }
public String reset() throws NoPlayerExeption {
        if(players.size()==0){
            throw new NoPlayerExeption("Non sono stati aggiunti giocatori.");
        }
        isOver = false;
    for (Player playerCorrente : players) {
        playerCorrente.setPosition(0);
        playerCorrente.setNThrow(0);
        playerCorrente.setStop(false);
    }
    return "Gioco resettato.";
}
    public void playRound() throws NoPlayerExeption, GameisOverExeption {
        if(players.size()==0){
            throw new NoPlayerExeption("Non c'é nessun giocatore");
        }
        if(!onGoing){

            onGoing = true;
        }
        //Turno
        for (Player current : players) {
            if (!current.isStop()) {
                int risultatoDado= diceThrow();

                int arrivalBoxTmp = current.getPosition() + risultatoDado;
                current.setLastThrow(risultatoDado);
                if (arrivalBoxTmp >= sizeBoard){
                    isOver = true;
                    onGoing=false;
                    winner= "Il giocatore "+current.getName() + " ha vinto con "+ (current.getNThrow() + 1) + " lanci di dado.";
                    throw new GameisOverExeption("Congratulazioni hai vinto");
                }

                ISpecialBox arrivalBox = boxes.get(arrivalBoxTmp);
                if(arrivalBox !=null){

                    try{
                        arrivalBoxTmp = arrivalBox.calculatePosition(arrivalBoxTmp);

                    } catch(ActionNotPermitedException e) {
                        System.out.println(e.getMessage()  +"\nEccezione gestita!");
                        current.setStop(true);
                    }
                }
                current.setPosition(arrivalBoxTmp);
                if(!current.isStop()) {
                    current.addThrow();
                }




            }else{
                current.setStop(false);
            }
        }
    }

    private void createBoard() {
        for(int i =0;i<sizeBoard;i++){

            switch (i) {
                case 1 -> boxes.add(new NumericBox(2));
                case 5 -> boxes.add(new NumericBox(-1));
                case 7 -> boxes.add(new NumericBox(+3));
                case 8 -> boxes.add(new NumericBox(0));
                case 9 -> boxes.add(new StopBox());
                case 12 -> boxes.add(new NumericBox(-3));
                default -> boxes.add(null);
            }


        }
    }
}
