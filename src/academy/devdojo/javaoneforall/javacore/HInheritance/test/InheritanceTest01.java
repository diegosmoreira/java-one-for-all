package academy.devdojo.javaoneforall.javacore.HInheritance.test;

import academy.devdojo.javaoneforall.javacore.HInheritance.domain.Adress;
import academy.devdojo.javaoneforall.javacore.HInheritance.domain.Employer;
import academy.devdojo.javaoneforall.javacore.HInheritance.domain.Person;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Person person = new Person("Peter");
        Employer employer = new Employer("Joe");
        Adress adress = new Adress();

        adress.setStreet("Av. Brasil");
        adress.setZipCode("08123-500");

        //person.setName("Peter");
        person.setId(123465);
        person.setAdress(adress);

        person.print();

        //employer.setName("Joe");
        employer.setId(112233);
        employer.setAdress(adress);
        employer.setSalary(10000);

        employer.print();
        employer.salaryReport();
    }
}
