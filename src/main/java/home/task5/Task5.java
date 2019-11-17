package home.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int n=0;
        System.out.println("Введите длину последовательности:");
        try {
            n = new Scanner(System.in).nextInt();
            if (n<1 || n>100)
                throw new Exception();
        } catch (Exception e ) {
            System.out.println("Слишком большое число");
            System.exit(1);
        }
        for (int i = 0; i < n+1; i++) {
            if (Integer.toString(i).equals(new StringBuilder(Integer.toString(i)).reverse().toString()))
                System.out.println(i + " ");
        }
    }
}
