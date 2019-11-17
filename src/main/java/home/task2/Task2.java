package home.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int firstNum = 0, secondNum = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число");
            firstNum=scanner.nextInt();
            System.out.println("Введите второе число");
            secondNum=scanner.nextInt();
        } catch (Exception e){
            System.out.println("Вы ввели некорректно одно из чисел");
            System.exit(1);
        }
        System.out.printf("Числа %d и %d\nНОД %d и НОК %d", firstNum,secondNum,NOD(firstNum,secondNum),NOK(firstNum,secondNum));
    }

    static int NOD(int x1, int x2){
        return x2 == 0 ? x1 : NOD(x2,x1 % x2);
    }

    static int NOK(int x1, int x2){
        return x1 / NOD(x1,x2) * x2;
    }
}
