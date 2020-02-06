package springexampleconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springexampleconfig.configs.MyConfig;
import springexampleconfig.entities.Cat;
import springexampleconfig.entities.Dog;
import springexampleconfig.entities.Parrot;

import static java.lang.System.out;

public class Main {
  public static void _main(String[] args) {

      ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

      Cat cat = context.getBean(Cat.class);
      Dog dog = (Dog) context.getBean("dog");
      Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

      out.println(cat.getName());
      out.println(dog.getName());
      out.println(parrot.getName());
  }
}
