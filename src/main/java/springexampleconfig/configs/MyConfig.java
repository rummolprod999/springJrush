package springexampleconfig.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springexampleconfig.entities.Cat;
import springexampleconfig.entities.Dog;
import springexampleconfig.entities.Parrot;

@Configuration
public class MyConfig {
    @Bean
    public Cat getCat() {
        return new Cat();
    }

    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(String.format("%s-killer", parrot.getName()));
        return cat;
    }

    @Bean("dog")
    public Dog getDog() {
        return new Dog();
    }

    @Bean("parrot-kesha")
    public Parrot weNeedMoreParrots() {
        return new Parrot();
    }
}
