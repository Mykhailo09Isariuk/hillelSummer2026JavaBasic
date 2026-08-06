package homeWork7;

import java.util.Arrays;
import java.util.Random;

public class HW7 {
    public static void main(String[] args) {
        // 1. Створюємо масив цілих чисел з 20 елементами
        int[] arr = new int[20];
        Random random = new Random();

        // 2. Заповнюємо масив випадковими числами від -100 до 100
        for (int i = 0; i < arr.length; i++) {
            // random.nextInt(201) дає від 0 до 200, віднімаємо 100 і маємо від -100 до 100
            arr[i] = random.nextInt(201) - 100;
        }

        // Виводимо створений масив на екран (використовуємо Arrays.toString для зручності)
        System.out.println("Елементи масиву: " + Arrays.toString(arr));
        System.out.println(); // пустий рядок для краси, як у прикладі

        // 3. Сума від'ємних чисел
        int sumNegative = 0;
        for (int num : arr) { // Читається як: "для кожного числа (num) у масиві (arr)"
            if (num < 0) {
                sumNegative += num; // Замість arr[i] ми просто використовуємо num
            }
        }
        System.out.println("Сума від'ємних чисел: " + sumNegative);
        System.out.println();

        // 4. Кількість парних і непарних чисел
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println();
        System.out.println("Кількість непарних чисел: " + oddCount);
        System.out.println();

        // 5. Найбільший та найменший елементи та їхні індекси
        // Беремо за основу перший елемент масиву
        int min = arr[0];
        int minIndex = 0;
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println();
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");
        System.out.println();

        // 6. Середнє арифметичне чисел після першого від'ємного числа
        int firstNegativeIndex = -1; // -1 означає, що ми його ще не знайшли

        // Шукаємо індекс першого від'ємного
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                firstNegativeIndex = i;
                break; // Знайшли перше — зупиняємо цикл
            }
        }

        // Якщо знайшли від'ємне число
        if (firstNegativeIndex != -1) {
            int sumAfter = 0;
            int countAfter = 0;

            // Рахуємо суму і кількість ТІЛЬКИ після цього індексу (тобто i = firstNegativeIndex + 1)
            for (int i = firstNegativeIndex + 1; i < arr.length; i++) {
                sumAfter += arr[i];
                countAfter++;
            }

            // Щоб не було ділення на нуль (наприклад, якщо від'ємне число було останнім у масиві)
            if (countAfter > 0) {
                // Рахуємо середнє і заокруглюємо "по-студентськи" до 2 знаків після коми
                double average = (double) sumAfter / countAfter;
                average = Math.round(average * 100.0) / 100.0;
                System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + average);
            } else {
                System.out.println("Після першого від'ємного числа немає інших елементів.");
            }
        } else {
            System.out.println("Від'ємних чисел у масиві немає.");
        }
    }
}
