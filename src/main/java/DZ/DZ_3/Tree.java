package DZ.DZ_3;

import java.util.ArrayList;

public class Tree implements BaseTree {
    @Override
    public void addLink(Human parent1, Human parent2, Human child) {
        tree.add(new Link(parent1, Relationship.list.parent, child));
        tree.add(new Link(parent2, Relationship.list.parent, child));
        tree.add(new Link(child, Relationship.list.children, parent1));
        tree.add(new Link(child, Relationship.list.children, parent2));
        ArrayList<Human> grandParents1;
        ArrayList<Human> grandParents2;
        grandParents1 = request(parent1, Relationship.list.parent);
        grandParents2 = request(parent2, Relationship.list.parent);

        if ((grandParents1.size() > 0) && (!grandParents1.get(0).toString().equals("NoMatches"))) {
            for (Human grand : grandParents1) {
                tree.add(new Link(grand, Relationship.list.grandparent, child));
                tree.add(new Link(child, Relationship.list.grandchild, grand));
            }
        }

        if ((grandParents2.size() > 0) && (!grandParents2.get(0).toString().equals("NoMatches"))) {
            for (Human grand : grandParents2) {
                tree.add(new Link(grand, Relationship.list.grandparent, child));
                tree.add(new Link(child, Relationship.list.grandchild, grand));
            }
        }
    }

    @Override
    public ArrayList<Human> request(Human human, Relationship.list rel) {
        ArrayList<Human> ans = new ArrayList<>();
        for (Link link : tree) {
            if ((link.getHum2() == human) && (link.getRel() == rel)) {
                ans.add(link.getHum1());
            }
        }
        if (ans.size() == 0) {
            ans.add(new Human("NoMatches", 0, Sex.list.noSex));
        }
        return ans;
    }
}
