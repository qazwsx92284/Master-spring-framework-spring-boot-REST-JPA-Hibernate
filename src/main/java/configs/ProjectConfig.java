package configs;

import beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
@Configuration is an annotation that indicates this class has @Bean definition method.
 */
@Configuration
public class ProjectConfig {

    /*
    whatever returned by the method annotated with @Bean will be generated Bean
     */
    @Bean(name="myVeh")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean(value="myVeh2")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Porsche 911");
        return veh;
    }

    @Primary
    @Bean("myVeh3")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Sonata");
        return veh;
    }

    /* any number/type of bean is possible
     */
    @Bean
    String hello() {
        return "hello";
    }

}
