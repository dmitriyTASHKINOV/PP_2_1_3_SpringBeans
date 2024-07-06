package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Timer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Timer timer = context.getBean(Timer.class);

        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    context.getBean(AnimalsCage.class);
            bean.setTimer(timer);
            bean.whatAnimalSay();
        }

    }

}
