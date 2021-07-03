public class HakkaNoodles extends FoodItems implements IVeg {


    public HakkaNoodles() {
        name = "HakkaNoodles";
        //   type = Type.VEG;
        category = Category.STARTERS;
        taste = Taste.SPICY;
        //   preparationTime = 20;
    }

    @Override
    public void mainIngredient() {
        System.out.println("Noodles and vegetables");
    }
}
