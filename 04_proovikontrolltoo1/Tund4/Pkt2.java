import java.util.*;
public class Pkt2 {
    double[] hoidla = new double[10];
    int olemas = 0;
    public void lisa(double arv){
        if(olemas >= hoidla.length){
            System.out.println("Hoildas pole ruumi!");
            return;
        }
        hoidla[olemas] = arv;
        olemas++;
    }

    public double[] libisevKesk(){
        return Pktn1.libisev(Arrays.copyOfRange(hoidla, 0, olemas));
    }
}