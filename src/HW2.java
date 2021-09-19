public class HW2 {
    public static void main(String[] args) {
        System.out.println(checkSUM(10, 5));
        sdd(-23);
        System.out.println(PrN(5));
        text("ТУТ должна быть ваша реклама", 10);
        test(2024);
        System.out.println(ye(2024));
    }

    public static boolean checkSUM(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }

    public static void sdd(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean PrN(int x) {
        return (x >= 0);
    }

    public static String text(String word, int timer) {
        for (int n = 0; n < timer; n++) {
            System.out.println(word);
        }
        return word;
    }
// На этом методе отрабатывал условие...
   public static void test(int x) {
        if ((x % 400) == 0 || (x % 100) != 0 & (x % 4) == 0) {
            System.out.println(x + " высокосный год");
        } else {
            System.out.println(x + " не высокосный год");
        }
    }
    public static boolean ye(int x){
        return (x % 400) == 0 || (x % 100) != 0 & (x % 4) == 0;
    }
}
