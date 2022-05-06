package implementation;

import interfaces.Tires;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HankookTire implements Tires {

    public String rotate() {
        return "Hankook tire is rotating";
    }
}
