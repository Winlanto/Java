package pkt2;

import java.util.*;

public class Kast {
    String tyyp;
    double hind;
    double  mass;
    int pesadeArv;
    int vabadpesad;
    List<Pudel> pudelid = new ArrayList<>();
    String str;

    public Kast(String tyyp, double hind, double mass, int pesadeArv, List<Pudel> pudelid) {
        this.tyyp = tyyp;
        this.hind = hind;
        this.mass = mass;
        this.pesadeArv = pesadeArv;
        if (this.pudelid.size()<= pesadeArv && this.pudelid.size() != 0){
            this.pudelid = pudelid;
            this.vabadpesad-= this.pudelid.size();
            str = "lisati uue kasti joogitega. Komplekt kogumassiga: "+koguMass()+" kg ja koguhinnaga: "+koguHind()+"€";

        }else if (this.pudelid.size() > pesadeArv){
            this.vabadpesad = pesadeArv;
            str = "lisati uue kasti, aga jookid ei mahu sisse. Komplekt kogumassiga: "+koguMass()+" kg ja koguhinnaga: "+koguHind()+"€";

        }else {
            str = "Lisatud kast materialist " + tyyp + ". Kast on tühi. Komplekt kogumassiga: " + koguMass() + " kg ja koguhinnaga: " + koguHind() + "€";
        }
        System.out.println(str);
    }

    public void lisaPudel(Pudel p){
        if (vabadpesad>0) {
            pudelid.add(p);
            vabadpesad--;
            str = "Kasti lisati uus pudel. Komplekt kogumassiga: "+koguMass()+" kg ja koguhinnaga: "+koguHind()+"€";

        }
    }

    public double koguMass(){
        double m = mass;
        for (int i = 0; i<pudelid.size(); i++){mass+=pudelid.get(i).koguMass(pudelid.get(i));}
        return m;
    }
    public double koguHind(){
        double h = hind;
        for (int i = 0; i<pudelid.size(); i++){mass+=pudelid.get(i).koguHind(pudelid.get(i));}
        return h;
    }
}
