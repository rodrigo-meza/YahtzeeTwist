import java.util.HashMap;

public class DadoDePuntos extends Dado{
    private HashMap<Integer,String[]> dotPositions = new HashMap<>();
    public DadoDePuntos(int x , int y){
        super(x,y);
        dotPositions.put(1,new String[]{"xxx","x.x","xxx"});
        dotPositions.put(2,new String[]{"xx.","xxx",".xx"});
        dotPositions.put(3,new String[]{"xx.","x.x",".xx"});
        dotPositions.put(4,new String[]{".x.","xxx",".x."});
        dotPositions.put(5,new String[]{".x.","x.x",".x."});
        dotPositions.put(6,new String[]{".x.",".x.",".x."});
    }
    @Override
    public void showSide() {
        
    }
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(dotPositions.get(value)[0]+"\n");
        sb.append(dotPositions.get(value)[1]+"\n");
        sb.append(dotPositions.get(value)[2]+"\n");
        return sb.toString();
        
        
    }

}