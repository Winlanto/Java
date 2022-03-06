public abstract class Animal{
    public String name, voice, animal;
    public double speed;
    //public Animal[] arr = new Animal[10];

    public String getName() { return name; }

    public String getVoice() { return voice; }

    public double getSpeed() { return speed; }

    public void setName(String name) { this.name = name; }

    public void setSpeed(double speed) { this.speed = speed; }

    public String toString(){ return "Animal: "+animal+" Name: "+name+", voice: "+voice+", speed: "+speed; }

    public void runSeconds(double time){ System.out.println(animal+" "+name+" ran "+time*speed+" meters for "+time+" seconds."); }

    public void runDistance(double meters){ System.out.println(animal+" "+name+" ran "+meters+" meters for "+meters/speed+" seconds."); }

    public void Run100(Animal[] animals){
        double distance = 100;
        for(int i=0; i<animals.length; i++){
            System.out.println("Time: "+distance/animals[i].speed);
        }
    }
}