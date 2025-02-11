package personalizedmealplangenerator;

class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }


    public void showMealDetails() {
        System.out.println("High-Protein Meal: " + mealName);
    }
}