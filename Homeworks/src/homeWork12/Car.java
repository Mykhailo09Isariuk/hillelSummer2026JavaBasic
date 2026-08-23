package homeWork12;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Автомобіль успішно заведено!");
    }

    private void startElectricity() {
        System.out.println("Ввімкнення електросистеми...");
    }

    private void startCommand() {
        System.out.println("Запуск блоку управління...");
    }

    private void startFuelSystem() {
        System.out.println("Подача пального...");
    }
}