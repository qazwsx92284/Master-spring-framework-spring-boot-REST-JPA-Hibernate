package main;

import beans.Person;
import beans.Vehicle;
import configs.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(person.getName());
        System.out.println(person.getVehicle());
        System.out.println(vehicle.getName());



    }
}
