import java.io.*;
public class Proov3 {
    public static void main(String[] args){
        LoendavLogija llg1 = new LoendavLogija(new FailiLogija2("logi.txt"));
        if (args.length == 2){
            llg1.logi(String.valueOf(Double.parseDouble(args[0])*Double.parseDouble(args[1])));
        }
        System.out.println(llg1.logimisteArv());
    }
}