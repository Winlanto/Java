import java.util.Scanner;
public class Kilpkonn {
    private int x,y, suund;
    //suund: 0 -> x++; 1-> y++; 2 -> x--; 3 -> y--;
    public String toString(){return "("+x+", "+y+", suund "+suund+")";}
    Scanner kysi = new Scanner(System.in);
    public int kysiX(){return x;}
    public int kysiY(){return y;}

    public void edasi(){
        if(suund == 0){x++;}
        if(suund == 1){y++;}
        if(suund == 2){x--;}
        if(suund == 3){y--;}
    }

    public void keera(){
        suund++;
        if (suund>3){suund = 0;}
    }

    public void kysiJargmist(){
        System.out.println("Kuhu edasi liigub kilpkonn: e -> edasi, k -> keera?");
        String j = kysi.next();
        if (j.equals("e")){edasi();}
        else if (j.equals("k")){keera();}
        else{System.out.println("vale sisend");}
        toString();
    }
}