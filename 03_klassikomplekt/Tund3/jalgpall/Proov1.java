public class Proov1 {
    public static void main(String[] args){
        Meeskond meeskond = new Meeskond("meeskond");
        Mangija n1 = new Mangija("Test", 7, 12, 30, 3.5);
        Mangija n2 = new Mangija("Test2", 14, 20, 80, 4.2);
        meeskond.lisaMangija(n1);
        meeskond.lisaMangija(n2);
//        System.out.println(n1);
        System.out.println(n1.kaugus(10,12));
        System.out.println(n1.kaugus(10,16));
        n1.liigu(2);
        n2.liigu(2);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println("\n"+meeskond);
        meeskond.liigu(3);
        System.out.println("\n"+meeskond);
        System.out.println(meeskond.lahim(40,20));



    }
}