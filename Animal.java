class Animal {
    void sound() {
        System.out.println("animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The Dog is barking bhaw bhaw!");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The Cat is meowing meow meow!");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal a1=new Dog();
        Animal a2=new Cat();
        a1.sound();
        a2.sound();
    }
}