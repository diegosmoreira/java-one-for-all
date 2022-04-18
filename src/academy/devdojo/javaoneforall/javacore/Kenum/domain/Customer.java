package academy.devdojo.javaoneforall.javacore.Kenum.domain;

public class Customer {

    private String name;
    private CustomerType customerType;
    private PaymenyType paymenyType;

    public Customer(String name, CustomerType customerType, PaymenyType paymenyType) {
        this.name = name;
        this.customerType = customerType;
        this.paymenyType = paymenyType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType +
                ", customerTypeInt=" + customerType.VALUE +
                ", customerTypeReportName=" + customerType.getReportName() +
                ", paymenyType=" + paymenyType +
                '}';
    }
}
