package school.devskill.theMazeGame.service.implementation;

import org.springframework.stereotype.Service;
import school.devskill.exeption.ActionNotPermitedException;
import school.devskill.exeption.GameisOverExeption;
import school.devskill.exeption.NoPlayerExeption;
import school.devskill.exeption.OngoingGameExeption;
import school.devskill.theMazeGame.service.interfaces.IServiceMaze;
import school.devskill.theMazeGame.utility.mazePath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("MazeService")
public class ServiceMazeImpl implements IServiceMaze {

    private int Rplayer , Cplayer;
    private final int maxRows = 8;
    private final int maxColumns = 12;

    private final String [] [] matrix = new String [maxRows] [maxColumns];
    private final String [] [] matrixMasked = new String [maxRows] [maxColumns];

    private final List<mazePath> path = new ArrayList<>();

    public ServiceMazeImpl() {
        matrixInitializer();
        Rplayer =Cplayer=0;
    }

    private void matrixInitializer(){
        for(int r = 0; r< maxRows; r++){
            for(int c = 0; c< maxColumns; c++){
            matrix[r][c]= "x";
            matrixMasked[r][c]= "x";
            }
        }
        path.addAll(Arrays.asList(
                new mazePath(0,0,"s"),
                new mazePath(0,1,"s"),
                new mazePath(0,2,"s"),
                new mazePath(0,3,"s"),
                new mazePath(0,4,"s"),
                new mazePath(0,5,"s"),
                new mazePath(0,6,"s"),
                new mazePath(0,7,"s"),
                new mazePath(0,8,"s"),
                new mazePath(0,9,"s"),
                new mazePath(0,10,"s"),
                new mazePath(1,5,"s"),
                new mazePath(1,10,"s"),
                new mazePath(2,5,"s"),
                new mazePath(2,4,"s"),
                new mazePath(2,3,"s"),
                new mazePath(2,2,"s"),
                new mazePath(2,1,"s"),
                new mazePath(3,5,"s"),
                new mazePath(3,6,"s"),
                new mazePath(3,7,"s"),
                new mazePath(3,8,"s"),
                new mazePath(3,9,"s"),
                new mazePath(3,10,"s"),
                new mazePath(4,2,"s"),
                new mazePath(4,3,"s"),
                new mazePath(4,4,"s"),
                new mazePath(4,5,"s"),
                new mazePath(4,1,"s"),
                new mazePath(5,5,"s"),
                new mazePath(5,1,"s"),
                new mazePath(5,6,"s"),
                new mazePath(5,7,"s"),
                new mazePath(5,8,"s"),
                new mazePath(5,9,"s"),
                new mazePath(5,10,"s"),
                new mazePath(6,5,"s"),
                new mazePath(6,3,"u"),
                new mazePath(6,2,"s"),
                new mazePath(6,1,"s"),
                new mazePath(6,10,"s"),
                new mazePath(7,5,"s")));

        for (mazePath pair : path) {
            matrix[pair.righa][pair.colonna] = pair.simbolo;
        }

    }



    @Override
    public String gameStatus() {
        String welcomeMsg = "Benvenuto nel labirinto!\nLe s indicano il sentiero calpestabile, la u sarà l'uscita.\nBuonaFortuna\n\n";
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        for(int r = 0; r< maxRows; r++){
            for(int c = 0; c< maxColumns; c++){
                if(r==Rplayer&&c==Cplayer){
                    result1.append("p");
                    result2.append("p");
                }else{
                    if(Rplayer==0 && Cplayer==0 && !(matrix[Rplayer][Cplayer].equals("u"))){
                        matrixMasked[Rplayer][Cplayer+1]=matrix[Rplayer][Cplayer+1];
                        matrixMasked[Rplayer+1][Cplayer]=matrix[Rplayer+1][Cplayer];
                    }
                    if(Rplayer>0 && Cplayer>0 && !(matrix[Rplayer][Cplayer].equals("u"))){
                        matrixMasked[Rplayer][Cplayer+1]=matrix[Rplayer][Cplayer+1];
                        matrixMasked[Rplayer][Cplayer-1]=matrix[Rplayer][Cplayer-1];
                        matrixMasked[Rplayer+1][Cplayer]=matrix[Rplayer+1][Cplayer];
                        matrixMasked[Rplayer-1][Cplayer]=matrix[Rplayer-1][Cplayer];
                    }
                    if(Rplayer==0 && Cplayer>0 && !(matrix[Rplayer][Cplayer].equals("u"))){
                        matrixMasked[Rplayer][Cplayer+1]=matrix[Rplayer][Cplayer+1];
                        matrixMasked[Rplayer][Cplayer-1]=matrix[Rplayer][Cplayer-1];
                        matrixMasked[Rplayer+1][Cplayer]=matrix[Rplayer+1][Cplayer];

                    }
                    if(Rplayer>0 && Cplayer==0 && !(matrix[Rplayer][Cplayer].equals("u"))){
                        matrixMasked[Rplayer+1][Cplayer]=matrix[Rplayer+1][Cplayer];
                        matrixMasked[Rplayer-1][Cplayer]=matrix[Rplayer-1][Cplayer];
                        matrixMasked[Rplayer][Cplayer+1]=matrix[Rplayer][Cplayer+1];
                    }
                    result1.append(matrix[r][c]);
                    result2.append(matrixMasked[r][c]);
                }

            }

            result1.append("\n");
            result2.append("\n");
        }
        if(matrix[Rplayer][Cplayer].equals("u")){
            return result1.toString();
        }
        return welcomeMsg+result2;
    }

    @Override
    public String reset() throws OngoingGameExeption {
        String message = "Partita resettata.\n";
        if(Rplayer==0 && Cplayer==0){
            throw new OngoingGameExeption("Non e'stata fatta ancora una mossa");
        }
        matrixInitializer();
        Rplayer=Cplayer=0;
        return message + gameStatus();
    }

    @Override
    public String movePlayer(String move) throws ActionNotPermitedException, GameisOverExeption {
        String message="";
        int newRow = Rplayer;
        int newColumn = Cplayer;
        switch (move) {
            case "up" -> newRow--;
            case "down" -> newRow++;
            case "right" -> newColumn++;
            case "left" -> newColumn--;
        }
        if(checkPosition(newRow,newColumn)){

            Rplayer=newRow;
            Cplayer=newColumn;
        }else{
            checkWinner();
            throw new ActionNotPermitedException("Azione non permessa, la direzione scelta ha una x");
        }
        checkWinner();
        return message + gameStatus();
    }

    private boolean checkPosition(int newrow, int newColumn){
        try{
             return !matrix[newrow][newColumn].equals("x");

        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }
    private void checkWinner() throws GameisOverExeption {
        if(matrix[Rplayer][Cplayer].equals("u")){
            throw new GameisOverExeption("Partita terminata, u trovata.");
        }
    }
}
