package tund10.kasutamine;

import java.util.*;

public class Proov1 {
    public static void main(String[] args) {
        //List<String> eesnimed= new ArrayList<String>();
        List<String> eesnimed = new LinkedList<String>();
        eesnimed.add("Juku");
        eesnimed.add("Mati");
        eesnimed.add("Kati");
        System.out.println(eesnimed);
        eesnimed.add(1, "Juhan");
        System.out.println(eesnimed);
        System.out.println(eesnimed.get(0));
        for (String eesnimi : eesnimed) {
            System.out.println(eesnimi);
        }
        Iterator<String> iterator = eesnimed.iterator();
        while (iterator.hasNext()) {
            String eesnimi = iterator.next();
            System.out.println(eesnimi);
        }
        Set<String> nimehulk = new HashSet<String>(eesnimed);
        System.out.println(nimehulk);
        String[] eesnimiedemassiiv = nimehulk.toArray(new String[0]);
        System.out.println(Arrays.toString(eesnimiedemassiiv));
        int jukuKoht = eesnimed.indexOf("Juku");
        if (jukuKoht>=0)System.out.println("Juku koht :"+jukuKoht);
        else System.out.println("Juku puudub");

    }
}
