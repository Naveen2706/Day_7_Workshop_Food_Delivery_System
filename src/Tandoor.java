public class Tandoor extends FoodItems implements INonVeg {

    public Tandoor() {
        name = "Tandoor";
        //  type = Type.VEG;
        category = Category.STARTERS;
        taste = Taste.SPICY;
        //  preparationTime = 20;
    }

    @Override
    public void mainIngredient() {
        System.out.println("Chicken");
    }
}
