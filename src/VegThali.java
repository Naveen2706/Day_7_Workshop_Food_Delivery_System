public class VegThali extends FoodItems implements IVeg {

    public VegThali() {
        name = "VegThali";
        category = Category.STARTERS;
        taste = Taste.SPICY;
    }

    @Override
    public void mainIngredient() {
        System.out.println("Vegetables");
    }
}
