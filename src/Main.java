import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 3.1.4 Дроби, 3.3.1 Запретная Дробь

        try {
            System.out.println("Создание первой дроби");
            int num1 = InputValidator.validateNonZeroIntegerInput(scanner, "Введите числитель:");
            int denom1 = InputValidator.validatePositiveIntegerInput(scanner, "Введите знаменатель (положительное число):");
            Fraction f1 = new Fraction(num1, denom1);

            System.out.println("\nСоздание второй дроби");
            int num2 = InputValidator.validateNonZeroIntegerInput(scanner, "Введите числитель:");
            int denom2 = InputValidator.validatePositiveIntegerInput(scanner, "Введите знаменатель (положительное число):");
            Fraction f2 = new Fraction(num2, denom2);

            System.out.println("\nПолученные примеры с дробями:");
            System.out.println("Первая дробь: " + f1);
            System.out.println("Вторая дробь: " + f2);
            System.out.println("Сумма " + "(" + f1 + ")" + " + " + "(" + f2 + ")" + " : " + f1.add(f2));
            System.out.println("Разность " + "(" + f1 + ")" + " - " + "(" + f2 + ")" + " : " + f1.subtract(f2));
            System.out.println("Произведение " + "(" + f1 + ")" + " * " + "(" + f2 + ")" + " : " + f1.multiply(f2));
            System.out.println("Частное " + "(" + f1 + ")" + " / " + "(" + f2 + ")" + " : " + f1.divide(f2));

        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // 3.1.7 Непустые имена

//        System.out.println("Введите имя:");
//        String firstName = getValidInput(scanner);
//        System.out.println("Введите фамилию (или оставьте пустым):");
//        String lastName = getValidInput(scanner);
//        System.out.println("Введите отчество (или оставьте пустым):");
//        String middleName = getValidInput(scanner);
//        Name name = new Name(
//                lastName.isEmpty() ? null : lastName,
//                firstName,
//                middleName.isEmpty() ? null : middleName
//        );
//        System.out.println("\nСозданное имя:");
//        System.out.println(name);

        // 3.2.2 Секреты ЕЩЕ НЕ ДОДЕЛАНО!

//        try {
//            Secrets secret1 = new Secrets("Алексей", "Это мой самый большой секрет!");
//            System.out.println(secret1);
//
//            Secrets secret2 = new Secrets(secret1, "Мария");
//            System.out.println(secret2);
//            Secrets secret3 = new Secrets(secret2, "Иван");
//            System.out.println(secret3);
//
//            System.out.println("Количество людей, узнавших секрет после Марии: " + secret2.getNumberOfPeopleWhoHeard());
//            System.out.println("Первый человек, узнавший секрет после Ивана: " + secret3.getNthKeeper(1));
//            System.out.println("Разница в длине текста секрета с первым человеком: " +
//                    secret3.getLengthDifferenceWithNthKeeper(-1));
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }

        // 3.4.2 Дробь это число

//        Fraction fraction1 = new Fraction(3, 4);
//        Fraction fraction2 = new Fraction(5, 2);
//        Fraction fraction3 = new Fraction(-7, 3);
//
//        System.out.println("Дробь 1: " + fraction1);
//        System.out.println("intValue дроби 1: " + fraction1.intValue());
//        System.out.println("doubleValue дроби 1: " + fraction1.doubleValue());
//
//        System.out.println("Дробь 2: " + fraction2);
//        System.out.println("longValue дроби 2: " + fraction2.longValue());
//        System.out.println("floatValue дроби 2: " + fraction2.floatValue());
//
//        System.out.println("Дробь 3: " + fraction3);
//        System.out.println("intValue дроби 3: " + fraction3.intValue());
//        System.out.println("doubleValue дроби 3: " + fraction3.doubleValue());
//
//        Fraction sum = fraction1.add(fraction2);
//        Fraction difference = fraction1.subtract(fraction2);
//        Fraction product = fraction1.multiply(fraction2);
//        Fraction quotient = fraction1.divide(fraction2);
//
//        System.out.println("\nПримеры арифметических операций:");
//        System.out.println(fraction1 + " + " + fraction2 + " = " + sum);
//        System.out.println(fraction1 + " - " + fraction2 + " = " + difference);
//        System.out.println(fraction1 + " * " + fraction2 + " = " + product);
//        System.out.println(fraction1 + " / " + fraction2 + " = " + quotient);

        //  Задача 3.5.1. Сложение НЕ ДОДЕЛАНО!



        // Задача 3.6.1. Сравнение дробей

//        Fraction fraction1 = new Fraction(3, 7);
//        Fraction fraction2 = new Fraction(9, 8);
//        Fraction fraction3 = new Fraction(15, 5);
//
//        System.out.println("Первая дробь: " + fraction1);
//        System.out.println("Вторая дробь: " + fraction2);
//        System.out.println("Третья дробь: " + fraction3);
//
//
//        if (fraction1.equals(fraction2)) {
//            System.out.println("\n" + "(" + fraction1 + ")" + " = " + "(" + fraction2 + ")");
//            System.out.println("Первая и вторая дроби равны.");
//        } else {
//            if (fraction1.compareTo(fraction2) > 0) {
//                System.out.println("\n" + "(" + fraction1 + ")" + " > " + "(" + fraction2 + ")");
//                System.out.println("Первая дробь больше второй.");
//            } else if(fraction1.compareTo(fraction2) < 0) {
//                System.out.println("\n" + "(" + fraction1 + ")" + " < " + "(" + fraction2 + ")");
//                System.out.println("Первая дробь меньше второй.");
//            }
//        }
//
//        if (fraction2.equals(fraction3)) {
//            System.out.println("\n" + "(" + fraction2 + ")" + " = " + "(" + fraction3 + ")");
//            System.out.println("Вторая и третья дроби равны.");
//        } else {
//            if (fraction2.compareTo(fraction3) > 0) {
//                System.out.println("\n" + "(" + fraction2 + ")" + " > " + "(" + fraction3 + ")");
//                System.out.println("Вторая дробь больше третьей.");
//            } else if (fraction2.compareTo(fraction3) < 0) {
//                System.out.println("\n" + "(" + fraction2 + ")" + " < " + "(" + fraction3 + ")");
//                System.out.println("Вторая дробь меньше третьей.");
//            }
//        }
//
//        if (fraction1.equals(fraction3)) {
//            System.out.println("\n" + "(" + fraction1 + ")" + " = " + "(" + fraction3 + ")");
//            System.out.println("Первая и третья дроби равны.");
//        } else {
//            if (fraction1.compareTo(fraction3) > 0) {
//                System.out.println("\n" + "(" + fraction1 + ")" + " > " + "(" + fraction3 + ")");
//                System.out.println("Первая дробь больше третьей.");
//            } else if (fraction1.compareTo(fraction3) < 0) {
//                System.out.println("\n" + "(" + fraction1 + ")" + " < " + "(" + fraction3 + ")");
//                System.out.println("Первая дробь меньше третьей.");
//            } else { System.out.println("Первая дробь равна третьей."); }
//        }

        // 3.8.3 Клонирование дроби

//        Fraction fraction1 = new Fraction(-84, 2);
//        Fraction clonedFraction = fraction1.clone();
//        System.out.println("Оригинальная дробь: " + fraction1);
//        System.out.println("Клонированная дробь: " + clonedFraction);
//
//        System.out.println("Они одинаковые объекты? " + (fraction1 == clonedFraction));
//        System.out.println("Они одинаковые по содержанию? " + fraction1.equals(clonedFraction));


    }


    // ПРОВЕРКИ
    private static String capitalizeEachWord(String input) {
        // строка всегда выводится с заглавной буквы, слова делятся по " " и "-"
        String[] words = input.split("(?<=\\s)|(?<=-)|(?=\\s)|(?=-)"); // разделение по пробелам и дефисам
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty() && word.matches("[\\p{L}]+")) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase());
            } else {
                result.append(word); // сохраняем пробелы или дефисы
            }
        }
        return result.toString().trim();
    }

    public static String validateString(String input) {
        // проверка на наличие цифр и запрещенных символов (кроме "-")
        if (!input.matches("[\\p{L}\\s-]*")) {
            throw new IllegalArgumentException("Введенная строка не должна содержать цифры и запрещенные символы (кроме '-').");
        }
        return capitalizeEachWord(input.trim());
    }

    private static String getValidInput(Scanner scanner) {
        String input;
        while (true) {
            input = scanner.nextLine();
            try {
                return validateString(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage() + " Попробуйте еще раз.");
            }
        }
    }


}