import java.io.*;
public class FailiLogija2 implements Logija {
    String failinimi;
    public FailiLogija2(String failinimi){
        this.failinimi = failinimi;
    }
    public void logi(String text){
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(failinimi, true));
            pw.println(new java.util.Date()+" "+text);
            pw.close();
        }catch(Exception e){
            System.out.println("viga logimisel: "+text+"\n"+e);
        }
    }
}