package factory.meals.german;

import factory.meals.Meal;
import factory.meals.MealFactory;

public class GermanMealFactory implements MealFactory {

    public Meal getMeal(String mealType) {
        switch (mealType) {
            case "breakfast":
                return new Breakfast();
            case "lunch":
                return new Lunch();
            case "supper":
                return new Supper();
            default:
                return null;
        }

    }
}
