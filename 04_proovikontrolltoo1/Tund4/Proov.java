import java.util.*;
public class Proov {
    public static void main(String[] args){
        Pkt2 eksemplar = new Pkt2();
        eksemplar.lisa(2);
        eksemplar.lisa(4);
        eksemplar.lisa(6);
        eksemplar.lisa(8);
        eksemplar.lisa(10);
        System.out.println(Arrays.toString(eksemplar.libisevKesk()));
    }
}