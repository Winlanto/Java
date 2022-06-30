public class Kodutoo{
    public static void far2cel(double far){
        double cel = (5*(far-32)/9);
        System.out.println(far + " Farenheiti on "+ cel + " Celsiumi.");
    }

    public static void cel2far(double cel){
        double far = ((cel*9)/5)+32;
        System.out.println(cel + " Celsiumi on " + far + " Farenheiti.");
    }

    public static void miles2km(double miles){
        double km = 1.609344*miles;
        double m = km*1000;
        System.out.format("%.2f miili on %.2f kilomeetrit ehk %.2f meetrit.\r\n", miles, km, m);
    }

    public static void km2miles(double km){
        double miles = 0.621371*km;
        double feet = 5280*miles;
        System.out.format("%.2f kilomeetrit on %.2f miili ehk %.2f footi.\r\n", km, miles, feet);
    }

    public static void main(String[] args){
        far2cel(-40);
        far2cel(32);
        far2cel(59);
        cel2far(0);
        cel2far(-40);
        cel2far(15);
        miles2km(10);
        miles2km(1);
        km2miles(10);
        km2miles(1);
    }
}