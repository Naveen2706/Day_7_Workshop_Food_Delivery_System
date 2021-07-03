import java.util.List;

public class Momos extends FoodItems implements IVeg {

    public Momos() {
        name = "Momos";
        //type = Type.VEG;
        category = Category.STARTERS;
        taste = Taste.SPICY;
        // preparationTime = 20;
    }

    @Override
    public void mainIngredient() {
        System.out.println("Omions and Cabbage");
    }
}
