package academy.devdojo.javaoneforall.javacore.Kenum.test;

import academy.devdojo.javaoneforall.javacore.Kenum.domain.Customer;
import academy.devdojo.javaoneforall.javacore.Kenum.domain.CustomerType;
import academy.devdojo.javaoneforall.javacore.Kenum.domain.PaymenyType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Diego", CustomerType.PESSOA_FISICA, PaymenyType.DEBIT);
        Customer customer2 = new Customer("Diego", CustomerType.PESSOA_JURIDICA, PaymenyType.CREDIT);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(PaymenyType.CREDIT.calculateDiscount(100));
        System.out.println(PaymenyType.DEBIT.calculateDiscount(100));

        System.out.println(CustomerType.getByReportValue("Pessoa Física'"));
    }
}
