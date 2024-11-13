package pl.example.vehicles;

public abstract class Vehicle{
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public int getMaxSpeed(){
        return 0;
    }
    public String getName(){
        return name;
    }
}

class Car extends Vehicle {
    public int doors;

    public Car(String name, int doors) {
        super(name);
        this.doors = doors;
    }
    public int getDoors(){
        return doors;
    }
    @Override
    public int getMaxSpeed(){
        return 200;

    }


}

class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }
    @Override
    public int getMaxSpeed(){
        return 50;
    }
}

