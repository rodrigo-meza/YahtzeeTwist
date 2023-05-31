import java.util.ArrayList;
import java.util.Random;

public class Jugador {
    private int score;
    private ArrayList<Dado> dice = new ArrayList<>();
    Random rnd =new Random();
    public Jugador(){
        score = 0;

    }
    public void throwDice (ArrayList<Dado> dice){
        
        for (Dado d :dice){
            d.setValue(rnd.nextInt(d.sides));
        }
    }
}
