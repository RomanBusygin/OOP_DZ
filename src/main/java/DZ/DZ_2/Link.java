package DZ.DZ_2;

public class Link {
    private final Human hum1;
    private final Human hum2;
    private Relationship.list rel;

    public Link(Human hum1, Relationship.list rel, Human hum2) {
        this.hum1 = hum1;
        this.hum2 = hum2;
        this.rel = rel;
    }

    public Human getHum1(){
        return this.hum1;
    }

    public Human getHum2(){
        return this.hum2;
    }

    public Relationship.list getRel(){
        return this.rel;
    }
}
