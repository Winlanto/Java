package tund10.loomine;

public class Proov3 {
    public static void main(String[] args){
        PaarideLoendur<Character> p1 = new PaarideLoendur<Character>();
        String lause = "kaval ants ja vanapagana saapad laekas";
        for (int i=0; i<lause.length(); i++){
            p1.lisa(lause.charAt(i));
        }
        System.out.println(p1.loendur);
        System.out.println(p1.jarjestatud());
    }
}
