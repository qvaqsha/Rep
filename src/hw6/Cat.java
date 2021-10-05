package hw6;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    public void run(int distance){
        if(distance<catD){
        System.out.println(name +" пробежал(а) " + distance + " м.");
        }else{
            System.out.println(name + " не побежит "+ catD + "м!");
        }
    }
    public void swim (int distance) {
        System.out.println("У нас кошки не плавают");
    }
}
