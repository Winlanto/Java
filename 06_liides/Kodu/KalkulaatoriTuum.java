import java.io.*;
public class KalkulaatoriTuum implements KalkulaatoriInterface{
    public void logi(String tulemus){
        try{
            PrintWriter pw = new PrintWriter(new FileWriter("ajalugu.txt", true));
            pw.println(new java.util.Date()+"   "+tulemus);
            pw.close();
        }catch(Exception e){
            System.out.println("viga logimisel: "+tulemus);
        }
    }
    public double liitmine(double[] arvud){
        double tulemus=0;
        String text = "";
        for (int i = 0; i<arvud.length; i++){
            tulemus+=arvud[i];
            text+=Double.toString(arvud[i])+" + ";
            if(i==arvud.length-1){ text+=Double.toString(arvud[i]); }
        }logi(text+" = "+tulemus);
        return tulemus;
    }
    public double lahutamine(double[] arvud){
        double tulemus=0;
        String text = "";
        for (int i = 0; i<arvud.length; i++){
            if(i==0){ tulemus+=arvud[i];text+=Double.toString(arvud[i]);}
            else { tulemus -= arvud[i]; text += " - " + Double.toString(arvud[i]);}
        }logi(text+" = "+tulemus);
        return tulemus;
    }
    public double korrutamine(double[] arvud){
        double tulemus=1;
        String text = "";
        for (int i = 0; i<arvud.length; i++){
            if(i==arvud.length-1) { text += Double.toString(arvud[i]);}
            else { text+=Double.toString(arvud[i])+" * "; }
            tulemus*=arvud[i];
        }logi(text+" = "+tulemus);
        return tulemus;
    }
    public double jagamine(double[] arvud){
        double tulemus=0;
        String text = "";
        for (int i = 0; i<arvud.length; i++){
            if(i==0){ tulemus+=arvud[i]; text+=Double.toString(arvud[i]); }
            else{tulemus/=arvud[i]; text+=" : "+Double.toString(arvud[i]); }
        }logi(text+" = "+tulemus);
        return tulemus;
    }
    public double ruutjuur(double arv){
        logi("V"+arv+" = "+Double.toString(java.lang.Math.sqrt(arv)));
        return java.lang.Math.sqrt(arv);
    }
}