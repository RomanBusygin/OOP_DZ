package DZ.DZ_1;

import java.util.ArrayList;

public class GenTree {
    private ArrayList<GenRecord> genTree = new ArrayList<>();

    public ArrayList<GenRecord> getTree() {
        return genTree;
    }

    public void addRecord (Human hum1, Human hum2) {
        genTree.add(new GenRecord(hum1, Relationship.parent(), hum2));
        genTree.add(new GenRecord(hum2, Relationship.children(), hum1));

    }
}
