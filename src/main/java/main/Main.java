package main;

import beans.Vehicle;
import configs.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh3 = context.getBean(Vehicle.class);
        System.out.println(veh3.getName());
        veh3.printHello();
    }
}
