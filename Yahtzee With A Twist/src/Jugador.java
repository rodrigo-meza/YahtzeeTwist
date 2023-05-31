import java.util.ArrayList;
import java.util.Random;

public class Jugador {
    private int score;
    private String name;
    private ArrayList<Dado> dice = new ArrayList<>();
    private boolean ones=false;
    private boolean twos=false;
    private boolean threes=false;
    private boolean fours=false;
    private boolean fives=false;
    private boolean sixes=false;
    private boolean threeOAK=false;
    private boolean fourOAK=false;
    private boolean fullHouse=false;
    private boolean sStraight=false;
    private boolean lStraight=false;
    private boolean chance=false;
    private boolean yahtzee= false;
    Random rnd =new Random();
    public Jugador(String n){
        score = 0;
        name = n;
        
    }
    public void throwDice (ArrayList<Dado> dice){
        
        for (Dado d :dice){
            if(!d.held)
            d.setValue(rnd.nextInt(d.sides));
        }
    }
    public void holdDice(){

    }
}
