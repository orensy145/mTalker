package core.entity;

import org.springframework.stereotype.Component;

@Component("ballHobby")
public class BallHobby implements Hobby{
    @Override
    public void showHobby() {
        System.out.println("I like play ball");
    }
}
