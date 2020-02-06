package weeks;

public class Wednesday implements WeekDay {
    @Override
    public String getWeekDayName() {
        return this.getClass().getName().toLowerCase();
    }
}
