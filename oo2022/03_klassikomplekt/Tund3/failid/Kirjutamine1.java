import java.io.*;
public class Kirjutamine1 {
    public static void main(String[] args)throws IOException{
        PrintWriter pw1=new PrintWriter(new FileWriter("valjund1.txt"));
        pw1.println("Tere, Alek!");
        pw1.println("Varsti hakkab kooli vaheaeg");
        pw1.close();
    }
}