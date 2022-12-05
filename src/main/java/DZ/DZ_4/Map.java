package DZ.DZ_4;

public class Map {
    private int[][] map = new int[9][7];

    public Map() {
        map[1][3] = -1;
        map[2][3] = -1;
        map[3][1] = -1;
        map[3][2] = -1;
        map[3][3] = -1;
        map[3][4] = -1;
        map[4][5] = -1;
        map[5][5] = -1;
        map[5][2] = -1;
        map[6][2] = -1;
        map[7][2] = -1;
    }

    public int[][] getMap() {
        return map;
    }

    public void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void setSell(int row, int col, int value) {
        map[row][col] = value;
    }

    public int getSell(int row, int col) {
        return map[row][col];
    }
}
