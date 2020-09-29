package core.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component("musicHobby")
public class MusicHobby implements Hobby{
    @Override
    public void showHobby() {
        System.out.println("I like music");
    }
}
