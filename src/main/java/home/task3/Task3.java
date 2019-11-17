package home.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String sentence = scanner.nextLine();
        System.out.println("Предложение: " +  sentence +"\nКоличество слов в предложении " + sentence.split(" ").length
                +"\nОтсортированное предложение: " + SortStr(sentence) + "\nС заглавными буквами: " + UppercaseFistLetter(sentence));
    }

    static String UppercaseFistLetter(String str){
        String[] splited = str.split(" ");
        for (int i = 0; i < splited.length; i++) {
            splited[i] = splited[i].substring(0, 1).toUpperCase() + splited[i].substring(1);
        }
        return String.join(" ", splited);
    }

    static String SortStr(String str){
        String[] splited = str.split(" ");
        Arrays.sort(splited);
        return String.join(" ", splited);
    }
}
