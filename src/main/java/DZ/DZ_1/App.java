package DZ.DZ_1;

public class App {
    public static void main(String[] args) {
        Human petya = new Human("Петя");
        Human ksenia = new Human("Ксюша");
        Human pasha = new Human("Паша");
        Human igor = new Human("Iгорь");
        Human olya = new Human("Оля");
        Human roma = new Human("Рома");

        GenTree tree = new GenTree();

        tree.addRecord(petya, igor);
        tree.addRecord(ksenia, igor);
        tree.addRecord(igor, pasha);
        tree.addRecord(olya, pasha);
        tree.addRecord(igor, roma);
        tree.addRecord(olya, roma);

        System.out.println(new Request(tree).research(igor, Relationship.children()));
    }
}