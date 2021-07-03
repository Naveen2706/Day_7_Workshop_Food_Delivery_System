public class VegThali extends FoodItems implements IVeg {

    public VegThali() {
        name = "VegThali";
        //  type = Type.VEG;
        category = Category.STARTERS;
        taste = Taste.SPICY;
        //preparationTime = 20;
    }

    @Override
    public void mainIngredient() {
        System.out.println("Vegetables");
    }
}
