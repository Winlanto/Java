public class Cat extends Animal{

    public Cat(){animal = "cat"; voice = "meow";}

    public Cat(String name){ animal = "cat"; this.name = name; voice = "meow"; speed = 32.2; }

    public Cat(String name, double speed){ animal = "cat"; this.name = name; voice = "meow"; this.speed=speed; }
}