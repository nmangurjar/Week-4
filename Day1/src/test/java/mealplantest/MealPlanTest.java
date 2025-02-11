package mealplantest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import personalizedmealplangenerator.VeganMeal;
import personalizedmealplangenerator.VegetarianMeal;

import java.util.Arrays;
import java.util.List;

class MealPlanTest {
    @Test
    void testVegetarianMealDetails() {
        VegetarianMeal vegetarianMeal = new VegetarianMeal("Green Salad");
        assertNotNull(vegetarianMeal);
    }

    @Test
    void testVeganMealDetails() {
        VeganMeal veganMeal = new VeganMeal("Salad");
        assertNotNull(veganMeal);
    }
}