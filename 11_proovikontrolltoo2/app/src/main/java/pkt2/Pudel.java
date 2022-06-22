package pkt2;

public class Pudel {
    double maht;
    double mass;
    double hind;
    String tyyp;
    Jook jook;
    String str;

    public Pudel(double maht, double mass, double hind, String tyyp, Jook jook) {
        this.maht = maht;
        this.mass = mass;
        this.hind = hind;
        this.tyyp = tyyp;
        this.jook = jook;
        str = "Lisatud pudel materialist "+tyyp+". Pudeli sees on "+jook.nimetus+".Komplekt kogumassiga "+koguMass(this)+" kg ja koguhinnaga: "+koguHind(this)+"€";
        System.out.println(str);
    }

    public Pudel(double maht, double mass, double hind, String tyyp) {
        this.maht = maht;
        this.mass = mass;
        this.hind = hind;
        this.tyyp = tyyp;
        this.jook = null;
        str = "Lisatud pudel materialist "+tyyp+". Pudel on tühi. Komplekt kogumassiga: "+koguMass(this)+" kg ja koguhinnaga: "+koguHind(this)+"€";
        System.out.println(str);
    }

    public double koguMass(Pudel p){
        double koguMass;
        if (jook == null)koguMass = p.mass;
        else koguMass = p.mass + p.maht*p.jook.erikaal;
        return koguMass;
    }

    public double koguHind(Pudel p){
        double koguHind;
        if (jook == null)koguHind = p.hind;
        else koguHind = p.hind + (p.maht*p.jook.erikaal)*p.jook.hind;
        return koguHind;
    }

    @Override
    public String toString(){
        return str;
    }
}


