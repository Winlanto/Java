public class Proov {
    public static void main(String[] args){
        Dog d1 = new Dog("puppy");
        Cat c1 = new Cat("kitty");
        Hare h1 = new Hare("bunny");
        Dog d2 = new Dog("dog", 40);
        Cat c2 = new Cat("cat", 38);
        Hare h2 = new Hare("hare", 42);
        Dog d3 = new Dog();
        Cat c3 = new Cat();
        Hare h3 = new Hare();
        System.out.println(d1);
        System.out.println(c1);
        System.out.println(h1);
        System.out.println(d2);
        System.out.println(c2);
        System.out.println(h2);
        System.out.println(d3);
        System.out.println(c3);
        System.out.println(h3);
        System.out.println();
        d1.runSeconds(2.5);
        c1.runSeconds(2.5);
        h1.runSeconds(2.5);
        d2.runSeconds(2.5);
        c2.runSeconds(2.5);
        h2.runSeconds(2.5);
        System.out.println();
        d1.runDistance(200);
        c1.runDistance(200);
        h1.runDistance(200);
        d2.runDistance(200);
        c2.runDistance(200);
        h2.runDistance(200);
        Animal[] sisend = {d1,c1,h1,d2,c2,h2};
        String[] vastus = Animal.Run100(sisend);
        for (int i =0; i< sisend.length;i++){
            System.out.println(vastus[i]);
        }
    }
}