package br.com.design.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleCache {

    private static Map<String, Vehicle> cache = new HashMap<>();

    private VehicleCache() {
    }

    static {
       Car car = new Car("tesla", "Model X", "Black", 200);
       Bus bus = new Bus("mercedes", "Setra", "White", 48);
       cache.put("tesla", car);
       cache.put("mercedes", bus);
    }

    public static Vehicle get(String type) {
        if (cache.containsKey(type)) {
            return cache.get(type).clone();
        }
        return null;
    }
}
