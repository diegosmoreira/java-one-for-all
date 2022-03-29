package academy.devdojo.javaoneforall.javacore.exercises.association.domain;

public class Place {
    private String address;

    public Place(String address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Address: " + this.address);
        System.out.println("-------------------");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
