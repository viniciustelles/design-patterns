package br.com.design.patterns.decorator.model;

import javax.sound.midi.Soundbank;

public class MilkShake implements Meal {


    @Override
    public void serve() {
        System.out.println("Adding Milk Shake");
    }

    @Override
    public Double getPrice() {
        return 10d;
    }
}
