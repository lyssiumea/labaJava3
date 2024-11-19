import java.util.Scanner;

public class InputValidator {   // проверки
    public static int validateNonZeroIntegerInput(Scanner scanner, String message) {
        int value;
        while (true) {
            value = validateIntegerInput(scanner, message);
            if (value != 0) {
                break;
            } else {
                System.out.println("Ошибка: значение не должно быть равно нулю.");
            }
        }
        return value;
    }

    public static int validateIntegerInput(Scanner scanner, String message) {
        int value;
        while (true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Ошибка: необходимо ввести целое число.");
                scanner.nextLine();
            }
        }
        return value;
    }


    public static int validatePositiveIntegerInput(Scanner scanner, String message) {
        int value;
        while (true) {
            value = validateIntegerInput(scanner, message);
            if (value > 0) {
                break;
            } else {
                System.out.println("Ошибка: значение должно быть положительным.");
            }
        }
        return value;
    }
}
