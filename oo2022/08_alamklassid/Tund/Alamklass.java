public class Alamklass extends Klass{
    public void viska(){
        if(super.res == 0){
            System.out.println("Mündiviskes võitis kull");
        }else{
            System.out.println("Mündiviskes võitis kiri");
        }
        super.showNum();
    }
}