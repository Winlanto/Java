import java.io.*;
public class Proov1 {
    public static void main(String[] args) throws IOException, FileNotFoundException, UnsupportedEncodingException{
//        Logija proovilogija = new LihtneLogija();
//        proovilogija.logi("algus");
//        if (args.length == 2){
//            System.out.println(Integer.parseInt(args[0])*Integer.parseInt(args[1]));
//        }
        Logija prooviLogija = new FailiLogija2("logi.txt");
        System.out.println("algus");
        if (args.length == 2){
            System.out.println(Double.parseDouble(args[0])*Double.parseDouble(args[1]));
            prooviLogija.logi(String.valueOf(Double.parseDouble(args[0])*Double.parseDouble(args[1])));
        }
        FailiLogija failiLogija = new FailiLogija();
        if (args.length == 3){
            System.out.println(Double.parseDouble(args[0])*Double.parseDouble(args[1])*Double.parseDouble(args[2]));
            failiLogija.logi(String.valueOf(Double.parseDouble(args[0])*Double.parseDouble(args[1])*Double.parseDouble(args[2])));
        }
        System.out.println("ots");
    }
}