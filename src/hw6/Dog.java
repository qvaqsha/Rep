package hw6;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    public void run(int distance){
        if(distance<dogD){
            System.out.println(name +" пробежал(а) " + distance + " м.");
        }else {
            System.out.println(name+ " не побежит так далеко!");
        }

    }

    public void swim (int distance){
        if (distance>dogSD){
            System.out.println(name + " не плывет дальше "+ dogSD +" м.");
        }else{
            System.out.println(name + " проплыл " + distance + " м.");
        }
    }

}
