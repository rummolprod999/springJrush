package springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springexample.entities.Cat;
import springexample.entities.Dog;
import springexample.entities.Parrot;

import static java.lang.System.out;

public class Main {
  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext("springexample.entities");

    Cat cat = context.getBean(Cat.class);
    Dog dog = (Dog) context.getBean("dog");
    Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

    out.println(cat.getName());
    out.println(dog.getName());
    out.println(parrot.getName());
  }
}
