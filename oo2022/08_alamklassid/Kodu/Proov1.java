public class Proov1 {
    public static void main(String[] args){
        Auto bolt = new Auto("Bolt", 10);
        Auto uber = new Auto("Uber", 10);
        Auto yandex = new Auto("Yandex", 10);
        System.out.println(bolt.getInfo());
        System.out.println(uber.getInfo());
        System.out.println(yandex.getInfo());
        System.out.println(bolt.getTotal());
        System.out.println(uber.getTotal());
        System.out.println(yandex.getTotal());
    }
}