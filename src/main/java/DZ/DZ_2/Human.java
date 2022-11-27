package DZ.DZ_2;

public class Human {
    private final String name;
    private final int birthYear;
    private final Sex.list sex;

    public Human(String name, int birthYear, Sex.list sex) {
        this.name = name;
        this.birthYear = birthYear;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
