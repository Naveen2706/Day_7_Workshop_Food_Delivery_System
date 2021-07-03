public class HakkaNoodles extends FoodItems implements IVeg {


    public HakkaNoodles() {
        name = "HakkaNoodles";
        category = Category.STARTERS;
        taste = Taste.SPICY;
    }

    @Override
    public void mainIngredient() {
        System.out.println("Noodles and vegetables");
    }
}
