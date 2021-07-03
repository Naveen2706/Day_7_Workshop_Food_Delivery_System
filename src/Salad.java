public class Salad extends FoodItems implements IVeg {


    public Salad() {
        name = "Salad";
        // type = Type.VEG;
        category = Category.STARTERS;
        taste = Taste.SPICY;
        // preparationTime = 20;
    }

    @Override
    public void mainIngredient() {
        System.out.println("Fruits");
    }
}
