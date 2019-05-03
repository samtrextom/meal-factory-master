package factory.meals;

import factory.meals.american.AmericanMealFactory;
import factory.meals.german.GermanMealFactory;

public class Driver {

    public static void main(String[] args) {
        GermanMealFactory mealFactory = new GermanMealFactory();
        AmericanMealFactory amMealFactory = new AmericanMealFactory();
        Hotel hotel = new Hotel(mealFactory);
        hotel.serveMeals();

        Hotel newHotel = new Hotel(amMealFactory);
        newHotel.serveMeals();
    }
}
