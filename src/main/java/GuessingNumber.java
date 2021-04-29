import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int guessingNumber = random.nextInt(100);

        System.out.println("Загадано целое число X от 0 до 100, попробуйте его угадать!");
        System.out.println("Вводите ваш вариант, пока не угадаете число:");

        Scanner scanner = new Scanner(System.in);

        StringBuilder guessingInputHistoryLine = new StringBuilder();

        while (true) {
            int inputNumber = scanner.nextInt();

            if (inputNumber > guessingNumber) {
                guessingInputHistoryLine.append(" X < ").append(inputNumber).append(";");
                System.out.println("Ваше число больше! " + " X < " + inputNumber);
                System.out.println(guessingInputHistoryLine);
                continue;
            } else if (inputNumber < guessingNumber) {
                guessingInputHistoryLine.append(" X > ").append(inputNumber).append(";");
                System.out.println("Ваше число меньше! " + " X > " + inputNumber);
                System.out.println(guessingInputHistoryLine);
                continue;
            }

            System.out.println("Вы угадали! Было загадано число " + guessingNumber);
            break;
        }
    }
}