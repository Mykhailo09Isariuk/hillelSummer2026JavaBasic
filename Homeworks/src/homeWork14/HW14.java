package homeWork14;

public class HW14 {

    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();

        // 1. Звичайне повідомлення з відправником
        ConsolePrinter.Message msg1 = new ConsolePrinter.Message("Привіт, як справи?", "Олексій");
        printer.print(msg1);

        // 2. Повідомлення без відправника (null)
        ConsolePrinter.Message msg2 = new ConsolePrinter.Message("Це важливе оголошення", null);
        printer.print(msg2);

        // 3. Пусте повідомлення (обидва поля null)
        ConsolePrinter.Message msg3 = new ConsolePrinter.Message(null, null);
        printer.print(msg3);
    }
}