package org.peaksoft.model;

import lombok.*;
import org.peaksoft.service.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
@Scope
public class Person {

    @Autowired
    @Qualifier("horse")
    private Animal animal;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person(Animal horse) {
        this.animal = horse;
    }

}
