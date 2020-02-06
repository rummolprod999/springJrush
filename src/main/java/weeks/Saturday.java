package weeks;

public class Saturday implements WeekDay {
    @Override
    public String getWeekDayName() {
        return this.getClass().getName().toLowerCase();
    }
}
