import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args){
        PrintThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void PrintThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a,b,c;
        System.out.println("Введите значение переменной а");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Введите значение переменной b");
        b = scanner.nextInt();
        c = a + b;
        if (c >= 0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
//        scanner.close(); - Если кусками вызывать метод.
    }
    public static void printColor(){
        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение переменой");
        value = scanner.nextInt();
        if (value <= 0){
            System.out.println("Красный");
        }
        else if (value >= 1 & value <= 100) {
            System.out.println("Желтый");
        }
        else if (value >= 101) {
            System.out.println("Зеленый");
        }
        scanner.close();
    }
    public static void compareNumbers(){
        int a,b;
        a = 2;
        b = 1;
        if (a>=b){
            System.out.println("a>=b");
        }
        else{
            System.out.println("a<b");
        }
    }
}
