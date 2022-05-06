package service;

import interfaces.Speakers;
import interfaces.Tires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private Speakers speakers;

    private Tires tires;

    @Autowired
    public VehicleService(@Qualifier("bridgeStoneTire") Tires tire) {
        this.tires = tire;
    }

    public void move() {
        System.out.println("moving");
    }

    public void playMusic() {
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void rotate() {
        String tire = tires.rotate();
        System.out.println(tire);
    }
}
