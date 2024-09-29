import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        String anyValue;
        final int NUM = 17;
        String word = "Hi";
        anyValue = NUM + " " + word;
        System.out.println("anyValue: " + anyValue);
        System.out.println("NUM: " + NUM);
        System.out.println("word: " + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число.");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число.");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String myName = scanner.nextLine();
        System.out.println("Привет, " + myName + "!");
    }
}