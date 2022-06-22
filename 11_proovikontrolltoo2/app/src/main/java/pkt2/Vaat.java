package pkt2;

public class Vaat {

    double ruumala;
    double kogus;
    Jook jook;
    String str;

    public Vaat(double ruumala, double kogus, Jook jook) {
        this.ruumala = ruumala;
        this.kogus = kogus;
        this.jook = jook;
        str = "Lisatud vaat "+ruumala+"l jookiga "+jook.nimetus+" hetkeseisu kogusega "+kogus+"l";
        System.out.println(str);
    }

    public void taida(Pudel p) {
        if (kogus > p.maht) {
            if (p.jook == null) {
                p.jook = jook;
                kogus -= p.maht;
                str = "Vaat " + ruumala + "l jookiga " + jook.nimetus + " hetkeseisu kogusega " + kogus + "l";
                p.str = "Lisatud pudel materialist " + p.tyyp + ". Pudeli sees on " + jook.nimetus + ".Komplekt kogumassiga " + p.koguMass(p) + " kg ja koguhinnaga: " + p.koguHind(p) + "€";

                System.out.println(p);
                System.out.println(this);
            } else {
                System.out.println("pudel on juba täidetud teise joogiga - " + p.jook.nimetus);
            }
        }
    }

    @Override
    public String toString(){
        return str;
    }
}
