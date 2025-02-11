package personalizedmealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VegetarianMeal vegetarianMeal = new VegetarianMeal("Veg Burger");
        VeganMeal veganMeal = new VeganMeal("Green Salad");
        KetoMeal ketoMeal = new KetoMeal(" Chicken Salad");
        HighProteinMeal highProteinMeal = new HighProteinMeal("Curd");

        Meal<VegetarianMeal> meal1 = new Meal<>(vegetarianMeal);
        Meal<VeganMeal> meal2 = new Meal<>(veganMeal);
        Meal<KetoMeal> meal3 = new Meal<>(ketoMeal);
        Meal<HighProteinMeal> meal4 = new Meal<>(highProteinMeal);

        meal1.displayMealInfo();
        meal2.displayMealInfo();
        meal3.displayMealInfo();
        meal4.displayMealInfo();

        // Using MealPlanGenerator with generic method
        List<MealPlan> allMeals = new ArrayList<>();
        allMeals.add(vegetarianMeal);
        allMeals.add(veganMeal);
        allMeals.add(ketoMeal);
        allMeals.add(highProteinMeal);

        System.out.println("\nGenerating Meal Plan:");
        MealPlanGenerator.generateMealPlan(allMeals);
    }
}

