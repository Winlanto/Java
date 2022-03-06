public class Naide4 {
    private int kordaja;
    private static int eksemplariLoendur=0;
    static int klassiLoendur;
    public Naide4(int uusKordaja){
        kordaja = uusKordaja;
    }
    int korruta(int arv){
        eksemplariLoendur++;
        klassiLoendur++;
        return kordaja*arv;
    }
    int mituKordaEksemplarisKaivitatud(){
        return eksemplariLoendur;
    }
    static int mituKordaKlassisKaivitatud(){
        return klassiLoendur;
    }
    static int korruta(int arv, int millega){
        klassiLoendur++;
        return arv*millega;
    }
}