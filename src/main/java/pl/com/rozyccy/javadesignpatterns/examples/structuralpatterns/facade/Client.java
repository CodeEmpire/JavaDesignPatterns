package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.facade;

public class Client {
    public static void main(String[] args) {
        BillingSystem billingSystem = new BillingSystem();
        InvoiceCustomerService invoiceCustomerService = new InvoiceCustomerService();
        FinancialSystemFacade financialSystemFacade = new FinancialSystemFacade();
        financialSystemFacade.setBillingSystem(billingSystem);
        financialSystemFacade.setInvoiceCustomerService(invoiceCustomerService);
        financialSystemFacade.createInvoice(1000);
    }
}
