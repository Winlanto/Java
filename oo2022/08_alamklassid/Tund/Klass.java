import java.util.Random;

public class Klass {
    Random random = new Random();
    int res=random.nextInt(2);
    public void showNum(){
        System.out.println(res);
    }
}