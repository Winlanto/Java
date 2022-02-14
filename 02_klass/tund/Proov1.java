public class Proov1 {
    public static void main(String[] args){
        Isikukood alek = new Isikukood("50010180833");
        Isikukood anna = new Isikukood("49904130825");
        System.out.println(alek.toString());
        System.out.println(alek.sugu());
        System.out.println(alek.synniaasta());
        System.out.println(alek.synnikuu());
        System.out.println(alek.synnipaev());
        System.out.println(alek.jarjekord());
        System.out.println(anna);
        System.out.println(anna.sugu());
        System.out.println(anna.synniaasta());
        System.out.println(anna.synnikuu());
        System.out.println(anna.synnipaev());
        System.out.println(anna.jarjekord());
    }
}