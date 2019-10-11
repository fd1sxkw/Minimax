package ai;

import kalaha.GameState;
import java.util.*;

public class Node {
    List<Node> this_Children;
    GameState this_GameState;
    public int getScore(int player) {
        return this_GameState.getScore(player) - this_GameState.getScore(2 / player);
    }

    public Node() {
        this_Children = new ArrayList<Node>(6);
        for(int i = 0; i < 6; i++) {
            this_Children.add(null);
        }

    }

    public void AddChild(Node child, int index) {
        this_Children.set(index-1,child);
    }


    public Node getChild(int index) {
        Node node = this_Children.get(index-1);
        return node;
    }


}