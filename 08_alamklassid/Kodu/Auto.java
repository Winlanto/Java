public class Auto extends Transport{

    public Auto(String taxiName, int kaugus) {
        super(taxiName, kaugus);
        if (taxiName == "Bolt" || taxiName == "bolt") {
            kmHind = 0.5;
            minutiHind = 0.2;
        }else if (taxiName == "Uber" || taxiName == "uber") {
            kmHind = 0.6;
            minutiHind = 0.25;
        }else{
            kmHind = 0;
            minutiHind = 0;
        }
    }

    public String getTotal(){
        if(taxiName == "Bolt" || taxiName == "bolt"){
            return "Boltiga soides maksab see Teile "+ getPrice() + " eurot.";
        }else if(taxiName == "Uber" || taxiName == "uber"){
            return "Uberiga soides maksab see Teile "+ getPrice() + " eurot.";
        }else{
            return "Kahjuks, Eestis ei ole takso firmat nimega "+taxiName+".";
        }
    }
}