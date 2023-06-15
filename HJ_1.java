package Home_work_3;

import java.util.ArrayList;
import java.util.Scanner;

// Пусть дан произвольный список целых чисел.
// 1) Найти максимальное значение
// 2) Найти минимальное значение
// 3) Найти среднее значение
// 4) Нужно удалить из него чётные числа

public class HJ_1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 4:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int max = numbers.get(0);
                for (int i = 1; i < numbers.size(); i++) {
                    if (numbers.get(i) > max) {
                        max = numbers.get(i);
                    }
                }
                System.out.println("Максимальное значение: " + max);
                break;
            case 2:
                int min = numbers.get(0);
                for (int i = 1; i < numbers.size(); i++) {
                    if (numbers.get(i) < min) {
                        min = numbers.get(i);
                    }
                }
                System.out.println("Минимальное значение: " + min);
                break;
            case 3:
                int sum = 0;
                for (int i = 0; i < numbers.size(); i++) {
                    sum += numbers.get(i);
                }
                double average = (double) sum / numbers.size();
                System.out.println("Среднее значение: " + average);
                break;
            case 4:
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) % 2 == 0) {
                        numbers.remove(i);
                        i--;
                    }
                }
                System.out.println("Список после удаления четных чисел: " + numbers);
                break;
            default:
                System.out.println("Некорректный выбор.");
                break;
        }
    }
    
}
