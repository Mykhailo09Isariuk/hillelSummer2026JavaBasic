package homeWork10;

import java.util.Arrays;
import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Завдання 1 ---
        System.out.print("1. Введіть ціле число: ");
        int num = scanner.nextInt();
        printSquare(num);
        System.out.println(); // Відступ для краси

        // --- Завдання 2 ---
        double radius = 3.5;
        double height = 10.0;
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("2. Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");
        System.out.println();

        // --- Завдання 3 ---
        int[] arr = {10, 20, 30, 40, 50};
        int arraySum = calculateArraySum(arr);
        System.out.println("3. Масив чисел: " + Arrays.toString(arr));
        System.out.println("  Сума всіх елементів масиву дорівнює " + arraySum + ".");
        System.out.println();

        // --- Завдання 4 ---
        // Очищаємо буфер сканера після зчитування чисел, щоб нормально зчитати рядок
        scanner.nextLine();
        System.out.print("4. Введіть рядок: ");
        String textToReverse = scanner.nextLine();
        String reversedText = reverseString(textToReverse);
        System.out.println("  Рядок в зворотньому порядку: " + reversedText);
        System.out.println();

        // --- Завдання 5 ---
        System.out.print("5. Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("  Введіть b: ");
        int b = scanner.nextInt();
        long powerResult = calculatePower(a, b);
        System.out.println("  Результат " + a + "^" + b + " дорівнює " + powerResult + ".");
        System.out.println();

        // --- Завдання 6 ---
        System.out.print("6. Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Очищаємо буфер знову
        System.out.print("  Введіть текстовий рядок: ");
        String textToRepeat = scanner.nextLine();
        printTextNTimes(n, textToRepeat);

        scanner.close();
    }

    // Метод 1: Виводить квадрат числа
    public static void printSquare(int num) {
        int square = num * num;
        System.out.println("  Квадрат числа " + num + " дорівнює " + square + ".");
    }

    // Метод 2: Обчислює і повертає об'єм циліндра
    public static double calculateCylinderVolume(double radius, double height) {
        // Формула об'єму циліндра: V = π * r^2 * h
        return Math.PI * radius * radius * height;
    }

    // Метод 3: Обчислює і повертає суму всіх елементів масиву
    public static int calculateArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Метод 4: Повертає рядок задом наперед
    public static String reverseString(String text) {
        String reversed = "";
        // Йдемо по рядку з кінця до початку
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    // Метод 5: Підносить число a до степеня b
    public static long calculatePower(int a, int b) {
        long result = 1;
        // Множимо a на себе b разів
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
        // Або можна було використати вбудований метод: return (long) Math.pow(a, b);
    }

    // Метод 6: Виводить рядок n разів
    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println("  " + text);
        }
    }
}
