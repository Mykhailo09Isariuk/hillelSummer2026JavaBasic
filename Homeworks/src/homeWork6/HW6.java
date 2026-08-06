package homeWork6;

public class HW6 {
    public static void main(String[] args) {
        int sum = 0;

        // Цикл від 1 до 6 включно
        for (int i = 1; i <= 6; i++) {
            sum += i; // Додаємо поточне число до загальної суми
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
        }

        // Виведення фінального результату
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}
