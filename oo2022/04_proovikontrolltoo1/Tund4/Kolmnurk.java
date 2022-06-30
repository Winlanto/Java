public class Kolmnurk {
    double[] xd = new double[3];
    double[] yd = new double[3];
    public Kolmnurk(double x1,double y1,double x2,double y2,double x3,double y3){
        xd[0] = x1;xd[1] = x2;xd[2] = x3;
        yd[0] = y1;yd[1] = y2;yd[2] = y3;
    }

    public void tryki(){
        for(int i=0; i< xd.length;i++){
            System.out.println(xd[i]+" "+yd[i]);
        }
    }

    double kaugus(double ax, double ay, double bx, double by){
        double dx=bx-ax; double dy=by-ay;
        return Math.sqrt(dx*dx+dy*dy);
    }

    public double ymbermoot(){
        double p1 = kaugus(xd[0],yd[0], xd[1], yd[1]);
        double p2 = kaugus(xd[1],yd[1], xd[2], yd[2]);
        double p3 = kaugus(xd[0],yd[0], xd[2], yd[2]);
        return p1+p2+p3;
    }

    public static void main(String[] args){
        Kolmnurk k1 = new Kolmnurk(0,0,3,4,4,3);
        System.out.println(k1.ymbermoot());
    }

}