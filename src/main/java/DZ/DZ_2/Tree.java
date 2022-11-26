package DZ.DZ_2;

import java.util.ArrayList;

public class Tree implements BaseTree{
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

        if (grandParents1.size() > 0) {
            for (Human grand : grandParents1) {
                tree.add(new Link(grand, Relationship.list.grandparent, child));
                tree.add(new Link(child, Relationship.list.grandchild, grand));
            }
        }

        if (grandParents2.size() > 0) {
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
        return ans;
    }
}
