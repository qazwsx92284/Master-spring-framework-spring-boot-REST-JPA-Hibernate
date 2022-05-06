package implementation;

import interfaces.Tires;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTire implements Tires {

    public String rotate() {
        return "bridgestone tire is rotating";
    }
}
