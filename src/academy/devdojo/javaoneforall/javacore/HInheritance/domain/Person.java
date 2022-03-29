package academy.devdojo.javaoneforall.javacore.HInheritance.domain;

public class Person {
    protected String name;
    protected int id;
    protected Adress adress;

    public Person(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.adress.getStreet() +" - "+ this.adress.getZipCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
