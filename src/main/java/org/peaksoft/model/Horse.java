package org.peaksoft.model;

import lombok.*;
import org.peaksoft.service.Animal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Horse implements Animal {

    @Value("${horse.breed}")
    private String breed;
    @Value("${horse.color}")
    private String color;

    @Override
    public void animalPlus() {
        System.out.println("Horse animalPlus();");
    }

    @Override
    public void animalMinus() {
        System.out.println("Horse animalMinus();");
    }
}
