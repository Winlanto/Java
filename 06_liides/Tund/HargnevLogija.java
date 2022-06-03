import java.util.*;
public class HargnevLogija implements Logija{
    List<Logija> puhver= new ArrayList<Logija>();
    public void lisaLogija(Logija l){puhver.add(l);}
    public void logi(String text){
        for (Logija abi: puhver){
            abi.logi(text);
        }
    }
}