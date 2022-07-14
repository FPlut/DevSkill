package school.devskill.GiocoDellOca.service.implementation;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import school.devskill.GiocoDellOca.eccezioni.GameisOverExeption;
import school.devskill.GiocoDellOca.gioco.ElementiDIGioco.StopBox;
import school.devskill.GiocoDellOca.gioco.ElementiDIGioco.NumericBox;
import school.devskill.GiocoDellOca.gioco.ElementiDIGioco.ISpecialBox;
import school.devskill.GiocoDellOca.gioco.ElementiDIGioco.Player;
import school.devskill.GiocoDellOca.eccezioni.ActionNotPermitedException;
import school.devskill.GiocoDellOca.eccezioni.NoPlayerExeption;
import school.devskill.GiocoDellOca.service.interfaces.IBoardManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service
public class BoardManagerImpl implements IBoardManager {

    private List<Player> players;
    private List<ISpecialBox> boxes;
    private final int sizeBoard = 14;
    private boolean isOver = false;
    private boolean onGoing;
    private String winner;
    
    public BoardManagerImpl() {
        this.players = new ArrayList<>();
        this.boxes = new ArrayList<>();
        createBoard();
        onGoing = false;

    }
    @Override
    public String gameStatus(){
        return players.toString();
    }
    public String addPlayer(Player p ) {
        players.add(p);
        return "Giocatore "+ p.getName()+ " aggiunto";
    }

    @SneakyThrows
    private int diceThrow()  {
        Random random = new Random();
        Thread.sleep(250);
        return random.nextInt(7-1) + 1;
    }
public void reset() throws NoPlayerExeption {
        if(players.size()==0){
            throw new NoPlayerExeption();
        }
        isOver = false;
    for (Player playerCorrente : players) {
        playerCorrente.setPosition(0);
        playerCorrente.setnThrow(0);
        playerCorrente.setStop(false);
    }
}
    public String winner(){
        return winner;
    }
    public void playRound() throws NoPlayerExeption, GameisOverExeption {
        if(players.size()==0){
            throw new NoPlayerExeption();
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
                    winner= "Il giocatore "+current.getName() + " ha vinto con "+ (current.getnThrow() + 1) + " lanci di dado.";
                    throw new GameisOverExeption();
                }

                ISpecialBox arrivalBox = boxes.get(arrivalBoxTmp);
                if(arrivalBox !=null){

                    try{
                        arrivalBoxTmp = arrivalBox.calculatePosition(arrivalBoxTmp);

                    } catch(ActionNotPermitedException e) {
                        e.printStackTrace();
                        System.out.println("Eccezione gestita!");
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
