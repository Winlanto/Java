package pkt2;

import java.util.*;

public class Proov {
    public static void main(String[] args){
        Jook j1 = new Jook("Vesi", 0.3, 1);
        Pudel p2 = new Pudel(0.5, 0.1, 0.2, "plastmass", j1);
        Pudel p1 = new Pudel(0.5, 0.2, 0.2, "klaas");
        Vaat v1 = new Vaat(10, 7.5, j1);
        v1.taida(p2);
        v1.taida(p1);
        List<Pudel> pudelid = new ArrayList<>();
        Kast k1 = new Kast("metall", 5, 3, 2, pudelid);
        pudelid.add(p1);
        pudelid.add(p2);
        Kast k2 = new Kast("puu", 5, 2, 1, pudelid);
        Kast k3 = new Kast("puu", 5, 2, 2, pudelid);
        k1.lisaPudel(p1);
    }
}