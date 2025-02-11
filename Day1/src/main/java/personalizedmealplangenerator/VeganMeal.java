package personalizedmealplangenerator;

public class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }


    public void showMealDetails() {
        System.out.println("Vegan Meal: " + mealName);
    }
}