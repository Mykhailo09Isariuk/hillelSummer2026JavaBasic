package homeWork8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        // 1. Створюємо масив цілих чисел з 15 елементами
        int[] arr = new int[15];
        Random random = new Random();

        // 2. Заповнюємо масив випадковими числами від 1 до 100
        for (int i = 0; i < arr.length; i++) {
            // nextInt(100) дає від 0 до 99, додаємо 1 і маємо від 1 до 100
            arr[i] = random.nextInt(100) + 1;
        }

        // 3. Виводимо початковий вигляд масиву
        System.out.println("Початковий вигляд масиву: " + Arrays.toString(arr));
        System.out.println(); // Пустий рядок для візуального розділення

        // 4. Сортування вставкою
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Запам'ятовуємо поточний елемент
            int j = i - 1;

            // Переміщуємо елементи, які більші за key, на одну позицію вперед
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Вставляємо key на правильне місце
            arr[j + 1] = key;
        }

        // 5. Виводимо відсортований масив
        System.out.println("Відсортований масив: " + Arrays.toString(arr));
        System.out.println();

        // 6. Просимо користувача ввести число для пошуку
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();

        // 7. Алгоритм бінарного пошуку
        int left = 0;
        int right = arr.length - 1;
        int foundIndex = -1; // -1 означає, що число ще не знайдено

        while (left <= right) {
            int mid = left + (right - left) / 2; // Знаходимо середину

            if (arr[mid] == target) {
                foundIndex = mid; // Знайшли число
                break; // Виходимо з циклу
            } else if (arr[mid] < target) {
                left = mid + 1; // Шукаємо в правій половині
            } else {
                right = mid - 1; // Шукаємо в лівій половині
            }
        }

        // Виводимо результат пошуку
        if (foundIndex != -1) {
            System.out.println("Індекс числа " + target + " у відсортованому масиві: " + foundIndex);
        } else {
            System.out.println("Числа " + target + " немає в масиві.");
        }

        scanner.close();
    }
}
