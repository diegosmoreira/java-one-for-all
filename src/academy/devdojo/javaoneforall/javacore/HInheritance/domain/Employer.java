package academy.devdojo.javaoneforall.javacore.HInheritance.domain;

public class Employer extends Person{
    private double salary;

    public Employer(String name) {
        super(name);
    }

    public void print(){
        super.print();
        System.out.println(this.salary);
    }

    public void salaryReport(){
        System.out.println("Salary of " +this.name + " is " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
