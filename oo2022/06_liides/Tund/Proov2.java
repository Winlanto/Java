import java.io.*;
public class Proov2 {
    public static void main(String[] args){
        Logija esimene = new LihtneLogija();
        Logija teine = new FailiLogija2("logi.txt");
        HargnevLogija yhendaja = new HargnevLogija();
        yhendaja.lisaLogija(esimene);
        yhendaja.lisaLogija(teine);
        if (args.length == 2){
            yhendaja.logi(String.valueOf(Double.parseDouble(args[0])*Double.parseDouble(args[1])));
        }
    }
}