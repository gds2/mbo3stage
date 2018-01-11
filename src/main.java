import sun.tools.jar.Main;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Govert on 10-1-2018.
 */
public class main implements Runnable{
    public static void main(String[] args) {
        new main().run();
    }

    void fill() {

        HashMap<Integer, Node> nodes = new HashMap<>();
        Node node1 = new Node("pink", 1);
        Node node2 = new Node("black", 2);
        Node node3 = new Node("green", 3);
        Node node4 = new Node("green", 4);
        Node node5 = new Node("green", 5);
        Node node6 = new Node("orange", 6);
        Node node7 = new Node("orange", 7);
        Node node8 = new Node("pink", 8);
        Node node9 = new Node("pink", 9);
        Node node10 = new Node("black", 10);
        Node node11 = new Node("orange", 11);
        Node node12 = new Node("pink", 12);
        Node node13 = new Node("orange", 13);
        Node node14 = new Node("green", 14);
        Node node15 = new Node("orange", 15);
        Node node16 = new Node("green", 16);
        Node node17 = new Node("green", 17);
        Node node18 = new Node("black", 18);
        Node node19 = new Node("orange", 19);
        Node node20 = new Node("green", 20);
        Node node21 = new Node("black", 21);
        Node node22 = new Node("black", 22);
        Node finish = new Node(23);


        node1.addPath(new Path("pink", node4));
        node1.addPath(new Path("black", node5));
        node2.addPath(new Path("pink", node12));
        node2.addPath(new Path("orange", node6));
        node3.addPath(new Path("orange", node1));
        node3.addPath(new Path("orange", node4));
        node4.addPath(new Path("black", node13));
        node5.addPath(new Path("orange", node9));
        node6.addPath(new Path("green", node9));
        node6.addPath(new Path("pink", node10));
        node7.addPath(new Path("black", node2));
        node8.addPath(new Path("green", node3));
        node9.addPath(new Path("green", node4));
        node9.addPath(new Path("black", node14));
        node10.addPath(new Path("green", node15));
        node11.addPath(new Path("pink", node10));
        node11.addPath(new Path("green", node12));
        node12.addPath(new Path("green", node7));
        node13.addPath(new Path("green", node18));
        node13.addPath(new Path("green", node8));
        node14.addPath(new Path("green", finish)); //todo add finish
        node14.addPath(new Path("orange", node20));
        node15.addPath(new Path("pink", finish)); // todo add finish
        node15.addPath(new Path("pink", node22));
        node16.addPath(new Path("green", node15));
        node17.addPath(new Path("black", node16));
        node17.addPath(new Path("black", node11));
        node18.addPath(new Path("orange", node9));
        node18.addPath(new Path("orange", node20));
        node19.addPath(new Path("green", node18));
        node20.addPath(new Path("orange", node21));
        node20.addPath(new Path("orange", node19));
        node21.addPath(new Path("orange", node22));
        node21.addPath(new Path("orange", finish)); //todo add finish
        node22.addPath(new Path("orange", node17));


        nodes.put(1, node1);
        nodes.put(2, node2);
        nodes.put(3, node3);
        nodes.put(4, node4);
        nodes.put(5, node5);
        nodes.put(6, node6);
        nodes.put(7, node7);
        nodes.put(8, node8);
        nodes.put(9, node9);
        nodes.put(10, node10);
        nodes.put(11, node11);
        nodes.put(12, node12);
        nodes.put(13, node13);
        nodes.put(14, node14);
        nodes.put(15, node15);
        nodes.put(16, node16);
        nodes.put(17, node17);
        nodes.put(18, node18);
        nodes.put(19, node19);
        nodes.put(20, node20);
        nodes.put(21, node21);
        nodes.put(22, node22);
        nodes.put(23, finish);


    }

    @Override
    public void run() {
        fill();
    }
}
