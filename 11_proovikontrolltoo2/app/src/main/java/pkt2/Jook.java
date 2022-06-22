package pkt2;

public class Jook {
    String nimetus;
    double hind;
    double erikaal;
    String str;

    public Jook(String nimetus, double hind, double erikaal) {
        this.nimetus = nimetus;
        this.hind = hind;
        this.erikaal = erikaal;
        str = "Lisatud jook "+nimetus+" hinnaga "+hind+" €/kg ning selle erikaal on "+erikaal+" kgs/m^3";
        System.out.println(str);
    }

    @Override
    public String toString(){
        return str;
    }
}