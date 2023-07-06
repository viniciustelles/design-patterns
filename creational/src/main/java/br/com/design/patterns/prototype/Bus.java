package br.com.design.patterns.prototype;

public class Bus extends Vehicle {

    private int seats;

    public Bus(Bus bus) {
        super(bus);
        this.seats = bus.seats;
    }

    public Bus(String brand, String model, String color, int seats) {
        super(brand, model, color);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}
