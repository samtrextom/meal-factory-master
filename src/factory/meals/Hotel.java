package factory.meals;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private MealFactory mealFactory;

    public Hotel(MealFactory mealFactory) {
        this.mealFactory = mealFactory;
    }

    public void serveMeals() {
        List<Meal> meals = new ArrayList<>();

        meals.add(mealFactory.getMeal("breakfast"));
        meals.add(mealFactory.getMeal("lunch"));
        meals.add(mealFactory.getMeal("supper"));
        meals.add(mealFactory.getMeal("breakfast"));

        for (Meal m : meals) {
            m.dispayMeal();
        }
    }
}
