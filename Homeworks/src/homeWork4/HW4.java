package homeWork4;

/*
    Сума продажів товару дорівнює добутку кількості та ціни. Ціна має грошовий формат,
    два знаки після десяткового роздільника. Середньоденна сума продажів дорівнює результату від поділу загальної суми
    продажів на кількість днів проведення торгівлі.

    (1) Створіть окремий проєкт.

    (2) В проєкті створіть пакет app, де створіть клас Main.

    (3) В класі Main реалізуйте функціонал розрахунку суми продажів за певний період та середньоденної суми продажів.
    При реалізації функціоналу зверніть увагу на створення та перевикористання певних змінних для відповідних даних товарів.
    Для округлення значень розрахункових сум можете скористатись можливостями System.out.printf() .

    (4) Виведення в консоль повинно мати такий вигляд:
    Product No 1: smartphone,
    total sales for 5 days is EUR 12153,41,
    sales by day is EUR 2430,68.
    Product No 2: laptop,
    total sales for 7 days is EUR 10486,85,
    sales by day is EUR 1498,12.
 */

public class HW4 {
    public static void main(String[] args) {
        int productNumber = 1;
        String productName = "smartphone";
        int days = 5;
        String productCurrency = "EUR";
        double productPrice = 200.59;
        int pieces = 15;

        // sales calculation
        double productSalesForDays = pieces * productPrice;
        String formattedProductSalesForDays = String.format("%.2f", productSalesForDays);
        double productSalesByDay = productSalesForDays / days;
        String formattedProductSalesByDay  = String.format("%.2f", productSalesByDay);

        // Output texts
        System.out.println("Product №" + productNumber + ": " + productName + ", ");
        System.out.println("total sales for " + days + " days is " + productCurrency + ' ' + formattedProductSalesForDays + ',');
        System.out.println("sales by day is " + productCurrency + ' ' + formattedProductSalesByDay + '.');

        // Changing values
        productNumber = 2;
        productName = "laptop";
        days = 7;
        productPrice = 258.89;
        pieces = 17;
        productSalesForDays = pieces * productPrice;
        formattedProductSalesForDays = String.format("%.2f", productSalesForDays);
        productSalesByDay = productSalesForDays / days;
        formattedProductSalesByDay  = String.format("%.2f", productSalesByDay);

        // Output texts
        System.out.println("Product №" + productNumber + ": " + productName + ", ");
        System.out.println("total sales for " + days + " days is " + productCurrency + ' ' + formattedProductSalesForDays + ',');
        System.out.println("sales by day is " + productCurrency + ' ' + formattedProductSalesByDay + '.');
    }
}
