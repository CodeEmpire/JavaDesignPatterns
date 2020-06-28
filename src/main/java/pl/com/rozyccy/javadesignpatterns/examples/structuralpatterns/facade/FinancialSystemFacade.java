package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.facade;

import lombok.Data;

@Data
public class FinancialSystemFacade {

    private BillingSystem billingSystem;
    private  InvoiceCustomerService invoiceCustomerService;

    public void createInvoice(Integer amount) {
        Bill bill = billingSystem.createBill(amount);
        invoiceCustomerService.createInvoiceForBill(bill);
    }
}
