package personalizedmealplangenerator;

import java.util.List;

class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(List<T> meals) {
        for (T meal : meals) {
            meal.showMealDetails();
        }
    }
}