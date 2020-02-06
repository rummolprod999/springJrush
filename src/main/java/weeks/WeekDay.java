package weeks;

public interface WeekDay {

    default String getWeekDayName() {
        return this.getClass().getName().toLowerCase();
    }
}
