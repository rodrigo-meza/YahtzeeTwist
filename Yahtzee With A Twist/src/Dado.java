import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public abstract class Dado {
    protected int sides;
    protected int value;
    protected ArrayList<String> colors = new ArrayList<>();
    protected HashMap<String,Integer> assignedValues = new HashMap<>();
    protected ArrayList<Integer> possibleValues = new ArrayList<>();
    protected int xpos,ypos;
    protected final int size = 60;
    protected boolean held;
    Random rnd = new Random();
    public Dado(int x, int y){
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");
        colors.add("orange");
        colors.add("pink");
        colors.add("yellow");
        value = 6;
        sides = 6;
        for (int i = 0; i<sides ; i++){
            possibleValues.add(i);
        }
        for(int i = 0; i<sides ; i++){
            int valueToAssign = possibleValues.get(rnd.nextInt(possibleValues.size()));
            String colorToAssign = colors.get(rnd.nextInt(colors.size()));
            assignedValues.put(colorToAssign, valueToAssign);
            possibleValues.remove((Integer)valueToAssign);
            colors.remove(colorToAssign);
        }
        xpos = x;
        ypos = y;
        held = false;
    }
    public abstract void showSide();
    public void setValue(int val){
        value = val;
    }
}
