package personalizedmealplangenerator;

class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }


    public void showMealDetails() {
        System.out.println("Keto Meal: " + mealName);
    }
}