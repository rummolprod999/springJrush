package weeks;

public class Thursday implements WeekDay {
    @Override
    public String getWeekDayName() {
        return this.getClass().getName().toLowerCase();
    }
}
