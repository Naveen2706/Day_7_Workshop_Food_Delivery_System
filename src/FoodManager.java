import java.util.ArrayList;
import java.util.List;

public class FoodManager {
    List<FoodItems> foodList = new ArrayList();

    void add(FoodItems foodItems) {
        foodList.add(foodItems);
    }

    void print() {
        for (FoodItems element : foodList)
            System.out.println(element);
    }

}
