// Задание №2
//2) Используя оператор "..." написать метод который выводит максимальное значение из переданных
package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        System.out.println("Это число больше" + Math.max(firstNumber, secondNumber));
    }
}
