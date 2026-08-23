package homeWork11;

public class HW11 {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        System.out.println("1. " + person1.getInfo());
        System.out.println("   " + person2.getInfo());
        System.out.println("   " + person3.getInfo());

        System.out.println();

        Person person4 = new Person("Alice", 28, "Архітектор");
        System.out.println("2. " + person4.getInfo());

        person4.setProfession("Дизайнер");
        System.out.println("   (Після оновлення професії)");
        System.out.println("   " + person4.getInfo());
    }
}