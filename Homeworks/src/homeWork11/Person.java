package homeWork11;

public class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getInfo() {
        return "Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession;
    }
}