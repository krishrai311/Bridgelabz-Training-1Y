package com.gla.Genericsproblem;

public class Meal {
    interface MealPlan {}

    class VegetarianMeal implements MealPlan {}
    class VeganMeal implements MealPlan {}

    class MealPlan<T extends MealPlan> {
        private T plan;

        public MealPlan(T plan) {
            this.plan = plan;
        }
    }

    class Utils {
        public static <T extends MealPlan> void generateMeal(T plan) {
            System.out.println("Meal generated: " + plan);
        }
    }
}
