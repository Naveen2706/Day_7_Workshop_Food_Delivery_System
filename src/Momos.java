public class Momos extends FoodItems implements IVeg {

    public Momos() {
        name = "Momos";
        category = Category.STARTERS;
        taste = Taste.SPICY;
    }

    @Override
    public void mainIngredient() {
        System.out.println("Omions and Cabbage");
    }
}
