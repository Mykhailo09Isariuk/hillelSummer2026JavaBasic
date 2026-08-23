package homeWork15;

public class HW15 {

    public static void main(String[] args) {
        Advisor advisor = new DayAdvisor();

        System.out.print("Понеділок: ");
        advisor.advise(Day.MONDAY);

        System.out.print("П'ятниця: ");
        advisor.advise(Day.FRIDAY);

        System.out.print("Неділя: ");
        advisor.advise(Day.SUNDAY);
    }
}