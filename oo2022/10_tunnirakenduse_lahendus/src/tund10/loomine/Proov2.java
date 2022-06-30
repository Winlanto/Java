package tund10.loomine;

public class Proov2 {
    public static void main(String[] args){
        PaarideLoendur<Integer> p1 = new PaarideLoendur<Integer>();
        p1.lisa(3);
        p1.lisa(2);
        p1.lisa(3);
        p1.lisa(2);
        System.out.println(p1.loendur);
    }
}
