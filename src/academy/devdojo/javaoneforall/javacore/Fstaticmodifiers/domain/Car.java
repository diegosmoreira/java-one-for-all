package academy.devdojo.javaoneforall.javacore.Fstaticmodifiers.domain;

public class Car {
    private String name;
    private double maxSpeed;
    /* static attributes belongs to classe and all objects share same value */
    private static double speedLimit = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("---------------");
        System.out.println("Name: " + this.name);
        System.out.println("Maximum speed: " + this.maxSpeed);
        System.out.println("Speed Limit:" + Car.speedLimit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /* Static methods are recomended to use when it don't access a class attribute */
    public static double getSpeedLimit() {
        return speedLimit;
    }

    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
    }
}
