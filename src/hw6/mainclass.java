package hw6;

public class mainclass{

    public static void main(String[] args) {
        Animal animal = new Animal("Животные");
        Dog dog = new Dog("Собака");
        Cat cat = new Cat("Рыжик");
        Cat cat2= new Cat("Вася");
        dog.run(100);
        cat2.run(4);
        cat.run(150);
        cat.swim(10);
        dog.swim(30);
    }

}
