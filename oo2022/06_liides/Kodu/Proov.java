public class Proov {
    public static void main(String[] args){
        KalkulaatoriTuum kt = new KalkulaatoriTuum();
        double[] arvud = {100, 10, 5, 2};
        System.out.println(kt.liitmine(arvud));
        System.out.println(kt.lahutamine(arvud));
        System.out.println(kt.korrutamine(arvud));
        System.out.println(kt.jagamine(arvud));
        System.out.println(kt.ruutjuur(576));
    }
}