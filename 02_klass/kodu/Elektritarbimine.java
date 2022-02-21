import java.util.Scanner;
public class Elektritarbimine {
    private int voimsus, aeg, valik; // Watt
    private double koguhind, koguelekter;
    private double elektrihind = 0.1751; //€
    private Scanner kysi = new Scanner(System.in);

    public String toString(){ return "Praegune elektrihind: "+elektrihind+" eurot\nSeade tootas "+aeg+" minutit voimsusega "+voimsus+"W\nKoguhind on "+koguhind+"eurot\nKoguelekter:"+koguelekter; }

    public String kysiElektrit(){ return "Praegune elektrihind: "+elektrihind+" eurot"; }

    public String loeElektrit(double voimsus, double aeg){
        koguelekter = voimsus/60 * aeg;
        return "Kasutatud energia: "+koguelekter+"W";
    }

    public String loeElektrit() {
        koguelekter = voimsus/60 * aeg;
        return "Kasutatud energia: " + koguelekter+"W";
    }

    public String loeHind(){
        loeElektrit();
        koguhind = koguelekter*elektrihind;
        return "Koguhind: "+koguhind+" eurot";
    }

    public String loeHind(double voimsus, double aeg){
        loeElektrit(voimsus/60, aeg);
        koguhind = koguelekter*elektrihind;
        return "Koguhind: "+koguhind+" eurot";
    }

    public void interf(){
        while(valik != 5) {
            System.out.print("1. Elektrihind\n2. Seade elektrikasutus\n3. Seade koguhind\n4. Kokkuvotte\n5. Valju\n");
            valik = kysi.nextInt();
            switch (valik) {
                case 1:
                    System.out.println(kysiElektrit());
                    continue;
                case 2:
                    System.out.println(loeElektrit());
                    continue;
                case 3:
                    System.out.println(loeHind());
                    continue;
                case 4:
                    System.out.println(toString());
                    continue;
                case 5:
                    break;
                default:
                    System.out.println("Vale sisend!");
            }
        }
    }

    public void kysiKasutajalt(){
        System.out.print("Sisesta voimsust (W): ");
        voimsus = kysi.nextInt();
        System.out.print("Sisesta seade tooaega (min): ");
        aeg = kysi.nextInt();
        interf();
    }
}