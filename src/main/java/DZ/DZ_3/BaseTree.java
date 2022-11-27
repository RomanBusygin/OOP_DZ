package DZ.DZ_3;

import java.util.ArrayList;

public interface BaseTree {
    ArrayList<Link> tree = new ArrayList<>();

    void addLink(Human parent1, Human parent2, Human child);
    ArrayList<Human> request(Human human, Relationship.list rel);
}
