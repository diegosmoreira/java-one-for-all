package academy.devdojo.javaoneforall.javacore.LAbstractclass.test;

import academy.devdojo.javaoneforall.javacore.LAbstractclass.domain.Developer;
import academy.devdojo.javaoneforall.javacore.LAbstractclass.domain.Employee;
import academy.devdojo.javaoneforall.javacore.LAbstractclass.domain.Manager;

public class EmployeeTest01 {

    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 5000);
        Developer developer = new Developer("Zoro", 12000);

        System.out.println(manager);
        System.out.println(developer);
        manager.print();
        developer.print();
    }
}
