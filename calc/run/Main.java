/**
* Класс для запуска калькулятора.
*/

package calc.run;

import calc.app.*;

public class Main {
    /**
     * Главный метод запуска калькулятора.
     * Создает экземпляры InputData и Actions для получения входных данных и
     * выполнения
     * арифметической операции соответственно. Получает входные числа и операцию
     * и переключается на соответствующий блок кода.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // InputData inputData = new InputData();
        Actions actions = new Actions();
        // int[] numbers = inputData.inputNumbers();
        int[] numbers = InputData.inputNumbers();
        // String action = inputData.inputAction();
        String action = InputData.inputAction();
        // String action = "+";
        // InputData num = new InputData();
        switch (action) {
            case "+":
                actions.sum(numbers);
                break;
            case "*":
                actions.mult(numbers);
                break;
            case "-":
                actions.sub(numbers);
                break;
            case "/":
                actions.div(numbers);
                break;
        }
    }

}