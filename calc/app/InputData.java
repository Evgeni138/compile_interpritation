/**
 * Класс, содержащий методы для ввода данных пользователем.
 */
package calc.app;

import java.util.Scanner;

public class InputData {

    public static Scanner iScanner = new Scanner(System.in);

    /**
     * Метод для ввода арифметической операции пользователем.
     *
     * @return введенная пользователем арифметическая операция
     */
    public static String inputAction() {
        System.out.print("Input action: ");
        String action = iScanner.next();
        return action;
    }

    /**
     * Метод для ввода двух чисел пользователем.
     *
     * @return массив из двух чисел, введенных пользователем
     */
    public static int[] inputNumbers() {
        int[] numbers = new int[2];
        System.out.print("Input number a: ");
        numbers[0] = iScanner.nextInt();
        System.out.print("Input number b: ");
        numbers[1] = iScanner.nextInt();
        return numbers;
    }
}