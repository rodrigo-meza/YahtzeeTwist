import java.util.ArrayList;
import java.util.HashMap;

public class DadoDeFiguras extends Dado{
    private HashMap<Integer,String> shapes = new HashMap<>();
    public DadoDeFiguras(int x, int y) {
        super(x, y);
        shapes.put(1, "circle");
        shapes.put(2, "square");
        shapes.put(3, "rectangle");
        shapes.put(4, "triangle");
        shapes.put(5, "pentagon");
        shapes.put(6, "rhombus");
    }
    @Override
    public void showSide() {

    }

}