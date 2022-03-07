public class Pktn1 {
    public static double keskmine(double a, double b, double c){
        return (a+b+c)/3;
    }

    public static double[] libisev(double[] massiiv){
        double[] keskmised = new double[massiiv.length - 2];
        for (int i = 0; i < keskmised.length; i++){
            keskmised[i] = keskmine(massiiv[i], massiiv[i+1], massiiv[i+2]);
        }
        return keskmised;
    }



    public static void main(String[] args){
        System.out.println(keskmine(3,4,5));
        double[] sisend = {2,4,5,78,8,9,6,5,4,6};
        double[] vastus = libisev(sisend);
        for(int i = 0; i < vastus.length; i++){
            System.out.println(vastus[i]);
        }
    }
}