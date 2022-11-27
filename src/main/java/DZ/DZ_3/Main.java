package DZ.DZ_3;

public class Main {
    public static void main(String[] args) {
        Human adam = new Human("Адам", 1977, Sex.list.male);
        Human eva = new Human("Ева", 1977, Sex.list.female);
        Human vova = new Human("Вова", 1977, Sex.list.male);
        Human jessika = new Human("Джессика", 1977, Sex.list.female);
        Human akakiy = new Human("Акакий", 1977, Sex.list.male);
        Human john = new Human("Джон", 1977, Sex.list.male);

        Tree tree = new Tree();

        tree.addLink(adam, eva, vova);
        tree.addLink(vova, jessika, akakiy);
        tree.addLink(vova, jessika, john);

        System.out.println(tree.request(john, Relationship.list.parent));
        System.out.println(tree.request(john, Relationship.list.grandparent));
        System.out.println(tree.request(vova, Relationship.list.children).get(0).getInfo());
        System.out.println(tree.request(john, Relationship.list.children));
    }
}
