package tund10.loomine;

public class Proov1 {
    public static void main(String[] args) {
        SamaTyypiPaar<Integer> asukoht = new SamaTyypiPaar<Integer>();
        asukoht.esimene = 7;
        asukoht.teine = 3;
        System.out.println(asukoht.esimene);
        System.out.println(asukoht);

        SamaTyypiPaar<String> nimed = new SamaTyypiPaar<String>();
        nimed.esimene = "Konstantin";
        nimed.teine = "Pats";
        System.out.println(nimed.esimene);
        System.out.println(nimed);

    }
}
