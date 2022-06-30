public class Litter {
    double coorX;
    double coorY;
    double kiirusX;
    double kiirusY;

    public Litter(double coorX, double coorY, double kiirusX, double kiirusY) {
        this.coorX = coorX;
        this.coorY = coorY;
        this.kiirusX = kiirusX;
        this.kiirusY = kiirusY;
        System.out.println("{X: " + coorX + "; Y: " + coorY + "}");
    }

    public String liigu(int aegS) {
        coorX += kiirusX * aegS;
        coorY += kiirusY * aegS;
        return "{X: " + coorX + "; Y: " + coorY + "}";
    }

    public boolean liiguHJ(int aegS) {
        double kiirus = kiirusX + kiirusY;
        while (kiirus > 0 && aegS > 0) {
            kiirus -= 1;
            aegS -= 1;
        }
        if (kiirus == 0) return true;
        return false;
    }

    public String liiguPlatsil(double kiirusHJ) {
        double kiirus = kiirusX + kiirusY;
        double x = kiirusX / kiirus;
        double y = kiirusY / kiirus;
        double aegS = kiirus / kiirusHJ;
        if (kiirus > 0){
            for (int i = 0; i < aegS; i++) {
                boolean kasYles = kiirusY > 0 ? true : false;
                kiirus -= kiirusHJ;
                coorX += kiirusX - x * i;
                if (coorY > 20 || coorY < 0){
                    double vahetulemus = coorY % 20;
                    coorY += -1*kiirusY - y * i;
                    if (kasYles){
                        coorY-=vahetulemus;
                        kasYles = false;
                    }else{
                        coorY+=vahetulemus;
                        kasYles = true;
                    }
                }else{
                    coorY += kiirusY - y * i;
                }
                System.out.println(coorY);
            }
        }
        return "{X: " + coorX + "; Y: " + coorY + "}";
    }
}
