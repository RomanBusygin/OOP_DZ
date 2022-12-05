package DZ.DZ_4;

import java.util.Queue;

public class Bypass {
    private final int[][] moves = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    private int[][] reverse;
    private int[] minExit;

    public void go (Map map, Queue que, int[] in, int[][] exits) {
        map.setSell(in[0], in[1], 1);
        que.add(in);

        while (!que.isEmpty()) {
            int[] elem = (int[]) (que.poll());
            for (int[] move : moves) {
                if ((elem[0] + move[0] >= 0) && (elem[1] + move[1] >= 0) && (elem[0] + move[0] < 9) && (elem[1] + move[1] < 7) &&
                        (map.getSell(elem[0] + move[0], elem[1] + move[1]) == 0)) {
                    que.add(new int[]{elem[0] + move[0], elem[1] + move[1]});
                    map.setSell(elem[0] + move[0], elem[1] + move[1], map.getSell(elem[0], elem[1]) + 1);
                }
            }
        }

        minExit = exits[0];
        for (int[] exit : exits) {
            if (map.getSell(exit[0], exit[1]) < map.getSell(minExit[0], minExit[1])) {
                minExit = exit;
            }
        }

        reverse = new int[map.getSell(minExit[0], minExit[1])][2];
        reverse[map.getSell(minExit[0], minExit[1]) - 1] = minExit;
        reverse[0] = in;

        for (int i = reverse.length - 2; i > 0; i--) {
            for (int j = 0; j < moves.length; j++) {
                if ((reverse[i + 1][0] + moves[j][0] >= 0) && (reverse[i + 1][0] + moves[j][0] < 9) && (reverse[i + 1][1] + moves[j][1] >= 0) && (reverse[i + 1][1] + moves[j][1] < 7)
                        && (map.getSell(reverse[i + 1][0] + moves[j][0], reverse[i + 1][1] + moves[j][1]) < map.getSell(reverse[i + 1][0], reverse[i + 1][1]))
                        && map.getSell(reverse[i + 1][0] + moves[j][0], reverse[i + 1][1] + moves[j][1]) != -1) {
                    reverse[i] = new int[]{reverse[i + 1][0] + moves[j][0], reverse[i + 1][1] + moves[j][1]};
                    break;
                }
            }
        }
    }
    public void printPath() {
        for (int[] rev : reverse) {
            for (int r : rev) {
                System.out.print(r);
            }
            System.out.println();
        }
    }
}
