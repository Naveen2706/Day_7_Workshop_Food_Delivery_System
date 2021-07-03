public class Tandoor extends FoodItems implements INonVeg {

    public Tandoor() {
        name = "Tandoor";
        category = Category.STARTERS;
        taste = Taste.SPICY;
    }

    @Override
    public void mainIngredient() {
        System.out.println("Chicken");
    }
}
