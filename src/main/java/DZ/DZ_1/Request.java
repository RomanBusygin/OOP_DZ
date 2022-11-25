package DZ.DZ_1;

import java.util.ArrayList;
import java.util.List;

public class Request {
    private ArrayList<GenRecord> tree;

    public Request(GenTree gt) {
        tree = gt.getTree();
    }

    public ArrayList<Human> research(Human hum, String rel) {
        ArrayList<Human> ans = new ArrayList<>();

        for (GenRecord rec : tree) {
            if ((rec.hum2 == hum) && (rec.rel.equals(rel))) {
                ans.add(rec.hum1);
            }
        }
        return ans;
    }
}
