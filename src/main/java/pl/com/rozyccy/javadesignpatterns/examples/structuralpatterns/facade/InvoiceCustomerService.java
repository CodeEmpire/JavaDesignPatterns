package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InvoiceCustomerService {

    public void createInvoiceForBill(Bill bill) {
        log.info("Creating invoice for bill with amount: {}", bill.getAmount());
    }
}
