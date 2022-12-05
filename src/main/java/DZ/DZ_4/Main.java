package DZ.DZ_4;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        Map map = new Map();
        int[][] exits = {{0, 2}, {0, 5}, {4, 6}};
        int[] in = {6, 1};
        Bypass byp = new Bypass();

        byp.go(map, queue, in, exits);
        map.printMap();
        byp.printPath();
    }
}
