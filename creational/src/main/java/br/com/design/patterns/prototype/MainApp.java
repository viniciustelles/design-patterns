package br.com.design.patterns.prototype;

public class MainApp {

    public static void main(String[] args) {
        Car car = (Car) VehicleCache.get("tesla");
        Bus bus = (Bus) VehicleCache.get("mercedes");
    }
}
