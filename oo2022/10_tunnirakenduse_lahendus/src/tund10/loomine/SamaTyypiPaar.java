package tund10.loomine;

public class SamaTyypiPaar<TyybiNimi extends Comparable<TyybiNimi> > implements Comparable< SamaTyypiPaar<TyybiNimi> >{
    TyybiNimi esimene;
    TyybiNimi teine;

    @Override
    public int compareTo(SamaTyypiPaar<TyybiNimi> vorreldav){
        int vahe1 = esimene.compareTo(vorreldav.esimene);
        if (vahe1!=0)return vahe1;
        return teine.compareTo(vorreldav.teine);
    }

    @Override
    public String toString(){
        return "("+esimene+"; "+teine+")";
    }
}
