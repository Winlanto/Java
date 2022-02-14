public class Proov3 {
    public static void main(String[] args) {
        int[][] laud= new int[10][10];
        //laud[2][3]=1;
        String juhis = "eeeekeekeeeekee";
        if(args.length>0){juhis=args[0];}
        Kilpkonn k1=new Kilpkonn();
        for(int i=0; i<juhis.length(); i++) {
            if (juhis.charAt(i) == 'e') {
                k1.edasi();
            } else {
                k1.keera();
            }
            //System.out.println(k1);
            laud[k1.kysiY()][k1.kysiX()] = 1;
        }
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(laud[i][j]);
            }
            System.out.println();
        }
    }
}