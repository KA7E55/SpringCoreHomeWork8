package org.peaksoft;

import org.peaksoft.config.SpringContainerConfig;
import org.peaksoft.model.Horse;
import org.peaksoft.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContainerConfig.class);

        Person person = context.getBean("person", Person.class);

        System.out.println(person);

        Horse horse = context.getBean("horse", Horse.class);

        System.out.println(horse);

        horse.animalPlus();
        horse.animalMinus();

        context.close();
    }
}
