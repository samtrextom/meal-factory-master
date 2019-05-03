package factory.meals.german;

import factory.meals.Meal;

public class Supper implements Meal {

    private String description;
    private boolean isDelicious;

    public Supper() {
        description = "Beef Brisket";
        isDelicious = true;
    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + (isDelicious ? "delicious" : "disgusting"));
    }
}
