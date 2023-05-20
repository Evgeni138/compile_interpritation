/**
 * Класс, содержащий методы для выполнения арифметических операций.
 */
package calc.app;

public class Actions {
    /**
     * Метод для сложения двух чисел.
     * 
     * @param numbers массив из двух чисел
     */
    public void sum(int[] numbers) {
        System.out.println(numbers[0] + numbers[1]);
    }

    /**
     * Метод для умножения двух чисел.
     * 
     * @param numbers массив из двух чисел
     */
    public void mult(int[] numbers) {
        System.out.println(numbers[0] * numbers[1]);
    }

    /**
     * Метод для вычитаниясложения двух чисел.
     * 
     * @param numbers массив из двух чисел
     */
    public void sub(int[] numbers) {
        System.out.println(numbers[0] - numbers[1]);
    }

    /**
     * Метод для деления двух чисел.
     * 
     * @param numbers массив из двух чисел
     */
    public void div(int[] numbers) {
        System.out.println(numbers[0] / numbers[1]);
    }
}