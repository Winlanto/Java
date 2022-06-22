package tund10.loomine;

import java.util.*;

public class PaarideLoendur<T extends Comparable<T>> {
    Map<SamaTyypiPaar<T>, Integer> loendur = new TreeMap<SamaTyypiPaar<T>, Integer>();
    T eelmine = null;

    void lisa(T el) {
        if (eelmine != null) {
            SamaTyypiPaar<T> uus = new SamaTyypiPaar<T>();
            uus.esimene = eelmine;
            uus.teine = el;
            if (loendur.containsKey(uus)) {
                loendur.put(uus, loendur.get(uus) + 1);
            } else {
                loendur.put(uus, 1);
            }
        }
        eelmine = el;
    }

    List<Map.Entry<SamaTyypiPaar<T>, Integer>> jarjestatud() {
        List<Map.Entry<SamaTyypiPaar<T>, Integer>> abi = new ArrayList<Map.Entry<SamaTyypiPaar<T>, Integer>>(loendur.entrySet());
        return abi;
    }
}
