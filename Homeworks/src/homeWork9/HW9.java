package homeWork9;

import java.util.Random;

public class HW9 {
    public static void main(String[] args) {
        // 1. Створюємо двовимірний масив (матрицю) розмірністю 4x4
        int[][] matrix = new int[4][4];
        Random random = new Random();

        // 2. Заповнюємо матрицю випадковими числами від 1 до 50
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // nextInt(50) дає від 0 до 49, додаємо 1 і маємо від 1 до 50
                matrix[i][j] = random.nextInt(50) + 1;
            }
        }

        // 3. Виводимо матрицю на екран
        System.out.println("Матриця 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Використовуємо \t (табуляцію) для рівного і красивого відображення колонок
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // Перехід на новий рядок після кожного рядка матриці
        }
        System.out.println(); // Пустий рядок для краси

        // 4. Шукаємо суму в парних і непарних рядках
        int sumEvenRows = 0;
        int sumOddRows = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    sumEvenRows += matrix[i][j]; // Рядки 0 та 2
                } else {
                    sumOddRows += matrix[i][j];  // Рядки 1 та 3
                }
            }
        }

        // 5. Шукаємо добуток у парних і непарних стовпцях
        // Використовуємо long, бо при множенні багатьох чисел число буде завеликим для int
        long prodEvenCols = 1;
        long prodOddCols = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j % 2 == 0) {
                    prodEvenCols *= matrix[i][j]; // Стовпці 0 та 2
                } else {
                    prodOddCols *= matrix[i][j];  // Стовпці 1 та 3
                }
            }
        }

        // 6. Виводимо результати сум та добутків точно як у прикладі
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sumEvenRows);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sumOddRows);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + prodEvenCols);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + prodOddCols);
        System.out.println();

        // 7. Перевірка, чи матриця є магічним квадратом
        boolean isMagicSquare = true;

        // Спочатку знайдемо суму першого рядка, щоб з нею порівнювати всі інші суми
        int targetSum = 0;
        for (int j = 0; j < 4; j++) {
            targetSum += matrix[0][j];
        }

        // Перевіряємо суми всіх рядків
        for (int i = 1; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != targetSum) {
                isMagicSquare = false;
                break; // Якщо хоч одна сума не збігається, далі можна не перевіряти
            }
        }

        // Перевіряємо суми всіх стовпців
        if (isMagicSquare) {
            for (int j = 0; j < 4; j++) {
                int colSum = 0;
                for (int i = 0; i < 4; i++) {
                    colSum += matrix[i][j];
                }
                if (colSum != targetSum) {
                    isMagicSquare = false;
                    break;
                }
            }
        }

        // Перевіряємо головну діагональ (з лівого верхнього кута в правий нижній)
        if (isMagicSquare) {
            int mainDiagonalSum = 0;
            for (int i = 0; i < 4; i++) {
                mainDiagonalSum += matrix[i][i];
            }
            if (mainDiagonalSum != targetSum) {
                isMagicSquare = false;
            }
        }

        // Перевіряємо побічну діагональ (з правого верхнього кута в лівий нижній)
        if (isMagicSquare) {
            int secondaryDiagonalSum = 0;
            for (int i = 0; i < 4; i++) {
                secondaryDiagonalSum += matrix[i][3 - i];
            }
            if (secondaryDiagonalSum != targetSum) {
                isMagicSquare = false;
            }
        }

        // Виводимо фінальний вердикт
        if (isMagicSquare) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }
}
