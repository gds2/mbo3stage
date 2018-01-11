import java.util.HashMap;

/**
 * Created by Govert on 10-1-2018.
 */
public class Board {

    private HashMap<Integer,Node> nodes;
    private Node end;

    public Board(Node end) {
        this.end = end;
        this.nodes = new HashMap<>();
    }

    public void addNode(Node node){
        nodes.put(node.getIndex(),node);
    }
}
