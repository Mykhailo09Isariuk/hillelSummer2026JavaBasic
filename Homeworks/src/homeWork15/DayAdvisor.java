package homeWork15;

public class DayAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Порада на будні: розплануйте пріоритети, фокусуйтеся на одній задачі та робіть перерви щогодини!");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Рекомендація на вихідні: завітайте до ботанічного саду, місцевого музею або затишного кафе.");
                break;
        }
    }
}