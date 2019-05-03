package factory.meals.american;

import factory.meals.Meal;

public class Lunch implements Meal {

    private String description;

    public Lunch() {
        description = "Tacos";
    }

    @Override
    public void dispayMeal() {
        System.out.println(description);
    }
}
