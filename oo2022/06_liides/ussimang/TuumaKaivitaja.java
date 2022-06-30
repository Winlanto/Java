import java.util.*;
public class TuumaKaivitaja {
    ManguTuum kaivitatav;
    public TuumaKaivitaja(ManguTuum uusKaivitatav){
        kaivitatav = uusKaivitatav;
        kaivitatav.ounaleJuhuslikKoht();
        new Timer().scheduleAtFixedRate(new TimerTask(){
            public void run(){
                kaivitatav.samm();
                System.out.println("Ussi koht: "+Arrays.deepToString(kaivitatav.ussiKohad())+"; Ouna koht: "+Arrays.toString(kaivitatav.ounaKoht())+"; Score: "+kaivitatav.showScore());
            }
        }, 0, 2000);
    }
}