interface MealPlan {}

class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T plan;

    public Meal(T plan) {
        this.plan = plan;
    }
}

class MealUtil {
    public static <T extends MealPlan> void generate(T meal) {
        System.out.println("Generated: " + meal.getClass().getSimpleName());
    }
}