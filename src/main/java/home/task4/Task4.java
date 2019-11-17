package home.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String text = scanner.nextLine();
        System.out.println("Введите слова");
        String word = scanner.nextLine();
        String[] splited = text.split(" ");
        int counter = 0;
        for (String arrWord: splited) {
            if (arrWord.equalsIgnoreCase(word)){
                counter++;
            }
        }
        System.out.println("Слово " + word + " употребляется " + counter + " раз");
    }
}
