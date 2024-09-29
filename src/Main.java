import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(90);
        System.out.println(1.9);

        System.out.println(5 + 6 * 2 / 3 - 1);
        System.out.println(17 % 3); // Оператор "Модуль". Дает остаток после деления.

        /*
        Многострочные комментарии.
         */

        int ageOfMyFriend = 20;
        System.out.println("Возраст моего друга: " + ageOfMyFriend + " лет.");
        System.out.println("Результат: " + (5 - 1));
        ageOfMyFriend = 21;
        System.out.println(ageOfMyFriend + 3);

        float price = 50.5f;
        char myFavoriteSymbol = '$';
        boolean isFirstNumberGreater = 10 > 1;
        System.out.println("Число 10 больше, чем число 1: " + isFirstNumberGreater);

        String myName = "Andrea Laboner";
        System.out.println(myName);

        final double MY_DIGIT = 3.4;

        int temperature = 32;
        int numOfStudents = 25;
        boolean isRainy = false;
        temperature = -4;

        if (temperature > 20) { // true
            System.out.println("Хорошая погода для прогулки.");
        }

        if (numOfStudents == 22) {
            System.out.println("Играем футбол.");
        }

        if (numOfStudents > 15) {
            System.out.println("Едем на пикник.");
        } else {
            System.out.println("Едем в кино.");
        }

        if (isRainy) {
            System.out.println("Возьми зонт.");
        } else {
            System.out.println("Можно купаться.");
        }

        if (temperature > 35) {
            System.out.println("На улице жарко.");
        } else if (temperature > 20) {
            System.out.println("На улице тепло.");
        } else if (temperature > 10) {
            System.out.println("На улице холодно.");
        } else {
            System.out.println("На улице морозно.");
        }

        numOfStudents = numOfStudents - 4;
        System.out.println(numOfStudents);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите тему урока: ");
        String themeOfLesson = scanner2.nextLine();
        System.out.println("Тема урока: " + themeOfLesson + " очень интересная.");
    }
}