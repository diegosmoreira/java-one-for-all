package academy.devdojo.javaoneforall.javacore.Jfinalmodifier.test;

import academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.BUYER.setName("Kira");
        System.out.println(Car.MAX_SPEED);
        System.out.println(car.BUYER);
    }
}