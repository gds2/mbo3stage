import java.util.ArrayList;
import java.util.List;

/**
 * Created by Govert on 9-1-2018.
 */
public class Node {
   private ArrayList<Path> paths;
   private String color;
   private int index;

    public Node(String color, int index) {
        this.color = color;
        this.index = index;
        this.paths =  new ArrayList<>();
    }

    public Node(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void addPath(Path path){
        paths.add(path);
    }
}
