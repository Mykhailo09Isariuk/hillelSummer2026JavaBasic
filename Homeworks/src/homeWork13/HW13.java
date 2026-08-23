package homeWork13;

public class HW13 {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5.0),
                new Triangle(4.0, 6.0),
                new Square(3.0)
        };

        printTotalArea(shapes);
    }

    public static void printTotalArea(Shape[] shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        System.out.printf("Сумарна площа всіх фігур: %.2f%n", totalArea);
    }
}