package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;

@Component
public class AnimalsCage {


    private Timer timer;
    @Autowired
    @Qualifier("cat")
    private Animal cat;
    @Autowired
    @Qualifier("dog")
    private Animal dog;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
    public Timer getTimer() {
        return timer;
    }
    @Autowired
    public void setTimer(Timer timer) {
        this.timer = timer;
    }
}
