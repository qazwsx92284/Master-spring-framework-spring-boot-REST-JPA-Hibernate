package implementation;

import interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speakers {

    public String makeSound() {
        return "bose speak is making sound";
    }
}
