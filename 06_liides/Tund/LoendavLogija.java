public class LoendavLogija implements Logija{
    Logija sihtLogija;
    int loendur = 0;
    public LoendavLogija(Logija logija){sihtLogija=logija;}
    public int logimisteArv(){return loendur;}
    public void logi(String teade){
        sihtLogija.logi(teade);
        loendur++;
    }
}