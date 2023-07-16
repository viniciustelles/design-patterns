package br.com.design.patterns.decorator.decorators;

import br.com.design.patterns.decorator.model.Meal;

public class FastFoodMeal implements Meal {

    private Meal meal;

    public FastFoodMeal(Meal meal) {
        this.meal = meal;
    }


    @Override
    public void serve() {
        meal.serve();
    }

    @Override
    public Double getPrice() {
        return meal.getPrice();
    }
}
