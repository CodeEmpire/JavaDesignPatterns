package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.facade;

public class BillingSystem {
    public Bill createBill(Integer amount) {
        return new Bill(amount);
    }
}
