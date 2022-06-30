public class Proov {
    public static void main(String[] args){
        Litter l1 = new Litter(0, 0,20,10);
        Litter l2 = new Litter(0, 0,20,10);
        Litter l3 = new Litter(0, 0,2,1);
        Litter l4 = new Litter(0, 0,20,10);
        System.out.println(l1.liigu(4));
        System.out.println(l2.liiguHJ(4));
        System.out.println(l3.liiguHJ(4));
        System.out.println(l4.liiguPlatsil(1));
    }
}
