package home.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Вы ввели не целое число");
            System.exit(1);
        }
        String anw = "Число " + number;

        if (number%2 == 0){
            anw = anw.concat(" четное");
        }
        else {
            anw = anw.concat(" нечетное");
        }
        boolean isComposite = false;
        for (int i = 2; i < 7; i++) {
            if(number%i==0){
                isComposite=true;
                break;
            }
        }

        if(isComposite){
            anw=anw.concat(" и составное");
        } else{
            anw= anw.concat(" и простое");
        }
        System.out.println(anw);
    }
}
