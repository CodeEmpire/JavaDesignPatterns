package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.facade;

import lombok.Data;

@Data
public class Bill {
    private Integer amount;

    public Bill(Integer amount) {
        this.amount = amount;
    }
}
