package app.config;

import app.model.Animal;
import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
@Bean
    public Timer timer(){
    return new Timer();
}
@Bean(name = "dog")
    public Dog dog(){
    return new Dog();
}
@Bean(name = "cat")
    public Cat cat(){
    return new Cat();
}
}
