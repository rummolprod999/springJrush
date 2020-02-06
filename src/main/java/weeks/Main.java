package weeks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springexample.entities.Dog;
import weeks.config.MyConf;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);
        WeekDay weekDay = context.getBean(WeekDay.class);
        Dog dog = context.getBean(Dog.class);
        out.printf("It's %s today!%nThe name dog is %s", weekDay.getWeekDayName(), dog.getName());
    }
}
