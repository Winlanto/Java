public class Dog extends Animal{

    public Dog(){ animal = "dog"; voice = "bark";}

    public Dog(String name){ animal = "dog"; this.name = name; voice = "bark"; speed = 36.9; }

    public Dog(String name, double speed){ animal = "dog"; this.name = name; voice = "bark"; this.speed=speed; }
}