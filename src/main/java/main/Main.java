package main;

import beans.Vehicle;
import configs.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var xmlContext = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle v = xmlContext.getBean(Vehicle.class);
        System.out.println("vehicle name from xml config vehicle bean : " + v.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // supplier when return a single line statement, {} are not needed
        Vehicle kia = new Vehicle();
        kia.setName("kia");
        Supplier<Vehicle> kiaSupplier = () -> kia;

        // multiple lines can be wrapped {}
        Supplier<Vehicle> hyundaiSupplier = () -> {
            Vehicle hyundai = new Vehicle();
            hyundai.setName("hyundai");
            return hyundai;
        };

        Random random = new Random();
        int randomNum = random.nextInt(10);
        System.out.println("random num : "+ randomNum);
        // if randomNum is even then create bean for kia
        if(randomNum%2 == 0)
            context.registerBean("kiaBean", Vehicle.class, kiaSupplier);
        // else create bean for hyundai
        else {
            context.registerBean("hyundaiBean", Vehicle.class, hyundaiSupplier);
        }
        // get beans and check values
        try {
            System.out.println(context.getBean("kiaBean", Vehicle.class));
            System.out.println(context.getBean("HyundaiBean"));

        } catch (NoSuchBeanDefinitionException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
