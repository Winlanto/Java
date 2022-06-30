public class Transport implements Taxi{
    public double kmHind, minutiHind, aeg;
    public int kiirus, kaugus;
    public String taxiName;

    public Transport(String taxiName,  int kaugus) {
        this.taxiName = taxiName;
        this.kaugus = kaugus;
        this.kiirus = 50;
        aeg = (double)kaugus/kiirus;
    }

    public String getInfo(){
        return "Takso: "+taxiName+"; kiirus: "+kiirus+" km/h; kaugus: "+kaugus+" km;aeg: "+aeg+" minutit; km hind: "+ kmHind+"; minuti hind: "+ minutiHind;
    }
    public double getPrice(){
        return kaugus*kmHind+aeg*minutiHind;
    }
}