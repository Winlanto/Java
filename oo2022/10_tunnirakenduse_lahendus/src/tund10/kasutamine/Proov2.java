package tund10.kasutamine;

import java.util.HashMap;
import java.util.Map;

public class Proov2 {
    public static void main(String[] args){
        Map<Integer, String> valvajad = new HashMap<Integer, String>();
        valvajad.put(1, "Kati");
        valvajad.put(2, "Mati");
        System.out.println(valvajad);
        valvajad.put(2, "Juku");
        System.out.println(valvajad);

        Map<String, Integer> hinded = new HashMap<String, Integer>();
        hinded.put("Kati", 1);
        hinded.put("Mati", 2);
        System.out.println(hinded);
        hinded.put("Juku", 2);
        System.out.println(hinded);
        System.out.println(hinded.keySet());
    }
}
