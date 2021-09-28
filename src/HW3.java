import java.util.Random;
import java.util.Scanner;

public class HW3 {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        z1(1);
        z2();
        z3(10);
        z4(3);
        z5(4,33);
        z6(5,30);
    }
    public static void z1(int array){
        int[] arr = new int[array];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(2);
            System.out.println("Orig > " + arr[i]);
            if (arr[i] == 0){
                arr[i]= 1;
            }else{arr[i]=0;}
            System.out.println("Changed > " + arr[i]);
        }
    }
    public static void z2(){
        int [] arr = new int[100];
        for (int i=0; i < arr.length; i++){
            arr[i]=i+1;
            System.out.print("  " + arr[i]);
        }
    }
    public static void z3(int array){
        int [] arr = new int[array];
        System.out.println(" ");
        for (int i=0; i < arr.length; i++){
            arr[i]=random.nextInt(10);
            System.out.print("| " + arr[i]);
            if (arr[i]<6){
                arr[i] = arr[i] * 2;
            }
            System.out.println(" > " + arr[i]);
        }
    }
    public static void z4(int array) {
        int[][] arr = new int[array][array];
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (arr[x] == arr[y]) {
                    arr[y][x] = 1;
                }
                System.out.println(arr[y][x]);
            }
        }
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x] + "\t");
            }
            System.out.println();
        }
    }

    public static void z5(int len,int initialValue) {
        int [] arr = new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=initialValue;
            System.out.print(arr[i] +" | ");
        }
    }


    public static void z6(int array,int bound){
        int [] arr = new int[array];
        System.out.println(" ");
        int max=0,min=bound;
        for (int i=0; i < arr.length; i++){
            arr[i]=random.nextInt(bound);
            if (max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }
            System.out.println(" > " + arr[i]);

        }
        System.out.println("maximum > " + max);
        System.out.println("minimum > " + min);
    }

}
