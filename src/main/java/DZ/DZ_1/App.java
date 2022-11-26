package DZ.DZ_1;

public class App {
    public static void main(String[] args) {
        Human petya = new Human("Петя");
        Human ksenia = new Human("Ксюша");
        Human pasha = new Human("Паша");
        Human vova = new Human("Вова");
        Human olya = new Human("Оля");
        Human roma = new Human("Рома");

        GenTree tree = new GenTree();

        tree.addRecord(petya, vova);
        tree.addRecord(ksenia, vova);
        tree.addRecord(vova, pasha);
        tree.addRecord(olya, pasha);
        tree.addRecord(vova, roma);
        tree.addRecord(olya, roma);

        System.out.println(new Request(tree).research(roma, Relationship.parent()));
    }
}