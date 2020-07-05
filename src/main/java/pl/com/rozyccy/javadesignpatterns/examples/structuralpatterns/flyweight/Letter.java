package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.flyweight;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Letter {
    private String value;

    public Letter(String value){
        log.info("New letter created with value: " + value);
        this.value = value;
    }
}
