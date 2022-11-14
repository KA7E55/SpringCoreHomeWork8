package org.peaksoft.config;

import org.peaksoft.model.Horse;
import org.peaksoft.model.Person;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.peaksoft")
@PropertySource("application.properties")
public class SpringContainerConfig {

    @Bean
    @Scope
    public Person getPerson() {
        return new Person();
    }

    @Bean
    @Scope
    public Horse getHorse() {
        return new Horse();
    }

}
