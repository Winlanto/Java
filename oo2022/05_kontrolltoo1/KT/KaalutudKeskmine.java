import java.io.*;
import java.util.*;
public class KaalutudKeskmine {
    static double h1, h2;
    public static String arvuta(int eap1, String hinne1, int eap2, String hinne2){
        String[] hinded = {"F", "E", "D", "C", "B", "A"};
        for(int i=0;i<hinded.length;i++){
            if(hinne1 == hinded[i]){h1=i;}
            if(hinne2 == hinded[i]){h2=i;}
        }
        return "EAP kokku: "+(eap1+eap2)+". Kaalutud keskmine: "+(h1*eap1+h2*eap2)/(eap1+eap2)+".";
    }

    public static String arvutaMassiiv( int[] EAPD, String[] hindedArr){
        String[] hinded = {"F", "E", "D", "C", "B", "A"};
        double hindedKokku = 0;
        int EAPDKokku = 0;
        for(int j=0;j<hindedArr.length;j++){
            EAPDKokku+=EAPD[j];
            for(int i=0;i<hinded.length;i++) {
                if (hindedArr[j].equals(hinded[i])) {
                    hindedKokku += i*EAPD[j];
                }
            }
        }
        return "EAP kokku: "+EAPDKokku+". Kaalutud keskmine: "+hindedKokku/EAPDKokku+".";
    }


    public static void main(String[] args) throws IOException{
        System.out.println(arvuta(6,"A", 3, "B"));
        System.out.println(arvuta(3,"A", 6, "B"));
        int[] sisendEAPD = {6,3,4,3,4,6};
        String[] sisendHinded = {"A", "C", "B", "E", "D", "F"};
        String vastus = arvutaMassiiv(sisendEAPD,sisendHinded);
        System.out.println(vastus);
        BufferedReader br = new BufferedReader(new FileReader("sisend.txt"));
        int[] failiEAP = new int[10];
        String[] failiHinne = new String[10];
        int olemas = 0;
        String rida = br.readLine();
        for(int i=0; rida !=null && rida.length()!=0; i++) {
            String[] m = rida.split(" ");
            failiEAP[i] = Integer.parseInt(m[0]);
            failiHinne[i] = m[1];
            olemas++;
            rida = br.readLine();
        }
        System.out.println(arvutaMassiiv(Arrays.copyOfRange(failiEAP, 0, olemas), Arrays.copyOfRange(failiHinne, 0, olemas)));
        PrintWriter pw = new PrintWriter(new FileWriter("valjund.txt"));
        pw.println(arvutaMassiiv(Arrays.copyOfRange(failiEAP, 0, olemas), Arrays.copyOfRange(failiHinne, 0, olemas)));
        pw.close();
    }
}

