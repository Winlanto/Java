/*import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;*/
package tund7;
import java.util.*;

public class ManguTuum1 implements ManguTuum{
    final char[] suunad = {'w','a','s','d'};
//    final int[] suunadBtn = {VK_W,VK_A,VK_S,VK_D};
    public int[] laius=new int[9], korgus=laius.clone(); //mängulaua pikkus/laius
    public int ounX, ounY, peaX = 0, peaY = 0, score = 0;
    public char suund = suunad[new java.util.Random().nextInt(suunad.length)];
    public char[] getSuunad(){return suunad.clone();}
    public void yles(){suund=suunad[0];}
    public void vasakule(){suund=suunad[1];}
    public void alla(){suund=suunad[2];}
    public void paremale(){suund=suunad[3];}

    //controls 1
    public void samm() {
        if (suund == suunad[0]) {
            peaY++;
            if (peaY > korgus.length) peaY = korgus[0];
        }
        if (suund == suunad[1]) {
            peaX--;
            if (peaX < laius[0]) peaX = laius.length;
        }
        if (suund == suunad[2]) {
            peaY--;
            if (peaY < korgus[0]) peaY = korgus.length;
        }
        if (suund == suunad[3]) {
            peaX++;
            if (peaX > laius.length) peaX = laius[0];
        }
        if (peaX == ounX && peaY == ounY){
            score++;
            ounaleJuhuslikKoht();
        }
    }
    //controls 2
        /*public void sammuke(KeyEvent e) {
            if (e.getKeyCode() == suunadBtn[0] && suund != suunad[0]) {
                peaY++;
                if (peaY > korgus.length) peaY = korgus[0];
            }if (e.getKeyCode() == suunadBtn[1] && suund != suunad[1]) {
                peaX--;
                if (peaX < laius[0]) peaX = laius.length;
            }if (e.getKeyCode() == suunadBtn[1] && suund != suunad[2]) {
                peaY--;
                if (peaY < korgus[0]) peaY = korgus.length;
            }if (e.getKeyCode() == suunadBtn[1] && suund != suunad[3]) {
                peaX++;
                if (peaX > laius.length) peaX = laius[0];
            }
        }*/


    public int[][] ussiKohad(){return new int[][] {{peaX, peaY}};}
    public int[] ounaKoht(){return new int[] {ounX, ounY};}
    public int showScore(){return score;}


    public int[] ounaleJuhuslikKoht(){
        ounX = (int)(laius.length*Math.random());
        ounY = (int)(korgus.length*Math.random());
        int[] oun = new int[] {ounX, ounY};
        System.out.println("Ouna uus asukoht: "+ Arrays.toString(ounaKoht()));
        return oun;
    }

    public int[] ounaleJuhuslikKoht(int ounX, int ounY){
        int[] oun = {ounX, ounY};
        this.ounX = ounX;
        this.ounY = ounY;
        System.out.println("Ouna uus asukoht: "+ Arrays.toString(ounaKoht()));
        return oun;
    }
}
