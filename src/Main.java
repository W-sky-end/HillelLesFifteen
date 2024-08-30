    public class Main {
        public static void main(String[] args) {
            Reception reception = new DaysReceptionImpl();
            reception.reception(Days.MONDAY);
            reception.reception(Days.FRIDAY);
            reception.reception(Days.SATURDAY);

        }
    }
