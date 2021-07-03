import java.util.*;

public class FoodManager {
    //List<FoodItems> foodList = new ArrayList();
    Set<FoodItems> foodList = new HashSet<>(); // it do not add multiple items of same object.
//    List<FoodItem> foodList = new ArrayList(); // it do not add multiple items of same object.

    void add(FoodItems foodItems) {
        foodList.add(foodItems);
    }

    void print() {
        for (FoodItems element : foodList)
            System.out.println(element);
    }

    void delete(FoodItems foodItems) {
        foodList.remove(foodItems);
    }

    int getFoodListCount() {
        return foodList.size();
    }

    public void printAllVegItems() {
        System.out.println("Printing all veg items");
        for (FoodItems element : foodList) {
            if (element instanceof IVeg) {
                System.out.println(element);
            }
        }

    }

    public void printAllNonVegItems() {
        System.out.println("Printing all Non-veg items");
        for (FoodItems element : foodList) {
            if (element instanceof INonVeg) {
                System.out.println(element);
            }
        }
    }

    public FoodItems getFoodItem(String name) {
        Iterator iterator = foodList.iterator();
        if (iterator.hasNext()) {
            for (int i = 0; i < foodList.size(); i++) {
                if (iterator.hasNext()) {
                    FoodItems foodItems = (FoodItems) iterator.next();
                    if (foodItems.name.equalsIgnoreCase(name)) {
                        return foodItems;
                    }
                }
            }
        }
        return null;
    }
}