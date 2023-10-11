package hw3t1;
import java.util.Scanner;

//Задача1 - перероблена з методами
// Програма запитує у корисутвача число. Результатом програми має бути
// інформація про число: парне/непарне, додатнє/від'ємне, просте/складене


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int number = scanner.nextInt();
        int result;

        // Перевірка на парність/непарність
        verifySimpleOrOddNumber(number);

        // Перевірка на додатність/від'ємність
        verifyPositiveOrNegativeNumber(number);

        // Перевірка на просте/складене
        verifySimpleOrCompoundNumber(number);

    }
    public static int verifySimpleOrOddNumber(int number) {
        //local variable
        int result = 0;
        if (number % 2 == 0) {
            System.out.println("Число парнe.");
        } else System.out.println("Число не парне.");
        return result;
    }

    public static int verifyPositiveOrNegativeNumber(int number) {
        if (number > 0) {
            System.out.println("Число додатнє.");
        } else {
            System.out.println("Число від'ємне.");
            int result = 0;
            return result;
        }
        return number;
    }

    public static int verifySimpleOrCompoundNumber (int number) {
        if (number % 1 == 0 || number % number == 0) {
            ;
            System.out.println("Число є простим.");
        } else {
            System.out.println("Число є складеним.");
        }
        int result = 0;
        return result;
    }
}