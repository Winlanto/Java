package tund7;

import java.util.*;

public class App {
    public String text(){return "Test";}

    public int korruta(int a, int b){return a*b;}

    public static void main(String[] args){
        System.out.println("Test");
        ManguTuum tuum = new ManguTuum1();
        tuum.ounaKoht();
        tuum.paremale();
        tuum.yles();
        tuum.samm();
        tuum.samm();
        System.out.println(Arrays.toString(tuum.ounaKoht()));
        System.out.println(tuum.showScore());
        tuum.ounaleJuhuslikKoht();
        tuum.ounaleJuhuslikKoht();
        tuum.ounaleJuhuslikKoht(2,1);
        System.out.println(Arrays.toString(tuum.ounaKoht()));
        System.out.println(Arrays.deepToString(tuum.ussiKohad()));
    }

}