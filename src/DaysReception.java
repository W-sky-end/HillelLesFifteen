public interface DaysReception extends Reception {

    default void reception(Days days) {
        switch (days) {
            case SUNDAY:
                System.out.println("Ты готов к новому труду");
                break;
            case MONDAY:
                System.out.println("Будь послушный раб");
                break;
            case TUESDAY:
                System.out.println("Подчиняйся");
                break;
            case WEDNESDAY:
                System.out.println("Твоя жизнь - работа");
                break;
            case THURSDAY:
                System.out.println("Работай! Скоро твой выходной");
                break;
            case FRIDAY:
                System.out.println("Пей спирт, тебе тяжело, отдай заработанное");
                break;
            case SATURDAY:
                System.out.println("Умирай, купи спирт, будет жизнь раб");
                break;
        }
    }
}