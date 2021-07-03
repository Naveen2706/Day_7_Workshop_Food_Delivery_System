public class Salad extends FoodItems implements IVeg {


    public Salad() {
        name = "Salad";
        category = Category.STARTERS;
        taste = Taste.SPICY;
    }

    @Override
    public void mainIngredient() {
        System.out.println("Fruits");
    }
}
