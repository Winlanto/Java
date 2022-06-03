import java.util.*;
import java.io.*;
public class Proov1 {
    public static void main(String[] args) throws IOException, IOError, IndexOutOfBoundsException{
        ManguTuum mt = new ManguTuum1();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        char[] suunad = mt.getSuunad();
        new TuumaKaivitaja(mt);
        while(true){
            String rida = br.readLine();
           if(rida.length()>=0){
               if(rida.charAt(0)==suunad[0])mt.yles();
               if(rida.charAt(0)==suunad[1])mt.vasakule();
               if(rida.charAt(0)==suunad[2])mt.alla();
               if(rida.charAt(0)==suunad[3])mt.paremale();
           }
        }
    }
}