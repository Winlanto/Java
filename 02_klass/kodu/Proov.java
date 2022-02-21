public class Proov {
    public static void main(String[] args){
        Elektritarbimine n1 = new Elektritarbimine();
        Elektritarbimine n2 = new Elektritarbimine();
        System.out.println(n1.loeElektrit(40, 180));
        System.out.println(n1.loeHind(40, 180));
        System.out.println(n1.kysiElektrit());
        n2.kysiKasutajalt();
    }
}