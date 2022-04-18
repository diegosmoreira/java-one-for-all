package academy.devdojo.javaoneforall.javacore.Kenum.domain;

public enum CustomerType {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALUE;
    private String reportName;

    CustomerType(int VALUE, String reportName) {
        this.VALUE = VALUE;
        this.reportName = reportName;
    }

    public static CustomerType getByReportValue(String reportName){
        for (CustomerType customerType : values()) {
            if(customerType.getReportName().equals(reportName)) {
                return customerType;
            }
        }

        return null;

    }

    public String getReportName(){
        return this.reportName;
    }
}
