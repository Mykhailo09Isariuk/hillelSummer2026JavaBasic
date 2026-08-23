package homeWork12;

public class HW12 {

    public static void main(String[] args) {
        Employee employee = new Employee(
                "Ісарюк Михайло Тарасович",
                "Java Developer",
                "isariuk@mail.com",
                "+380971234567",
                28
        );

        System.out.println("Створено співробітника: " + employee.getFullName() + ", посада: " + employee.getPosition());
        System.out.println("------------------------------------");

        Car car = new Car();
        car.start();
    }
}