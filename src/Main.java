import java.util.Scanner;

public class Main {
    FoodManager foodManager = new FoodManager();

    public static void main(String[] args) {

        Main main = new Main();

        Salad salad = new Salad();
        salad.price = 40;
        salad.mainIngredient();
        Salad salad1 = new Salad();
        salad1.price = 50;

        HakkaNoodles hakkaNoodles = new HakkaNoodles();
        hakkaNoodles.price = 60;
        hakkaNoodles.mainIngredient();

        Momos momos = new Momos();
        momos.price = 80;
        momos.mainIngredient();

        Tandoor tandoor = new Tandoor();
        tandoor.price = 110;
        tandoor.mainIngredient();

        VegThali vegThali = new VegThali();
        vegThali.price = 120;
        vegThali.mainIngredient();

        main.foodManager.add(tandoor);
        main.foodManager.add(vegThali);
        main.foodManager.add(momos);
        main.foodManager.add(salad);
        main.foodManager.add(salad1);
        main.foodManager.add(hakkaNoodles);

       /* main.foodManager.print();
         System.out.println("Before Removing :: " + foodManager.getFoodListCount());
        foodManager.delete(salad1);
        System.out.println("After Removing :: " + foodManager.getFoodListCount());
        main.foodManager.print();
        main.foodManager.printAllVegItems();
        main.foodManager.printAllNonVegItems();
        */

        main.showMenu();
        //main.foodManager.print();
    }

    void showMenu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Update Food item");
        System.out.println("Enter Choice");
        //scanner.close();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                updateFoodItem();
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }

    private void updateFoodItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Food Item");
        String item = sc.next();
        FoodItems foodItems = foodManager.getFoodItem(item);
        System.out.println(foodItems);

        System.out.println("Enter 1-Taste 2-Prep Time, 3-name, 4-category");
        int parameter = sc.nextInt();
        switch (parameter) {
            case 1:
                updateTaste(foodItems);
                break;
        }
        System.out.println(foodItems);
    }

    private void updateTaste( FoodItems foodItems){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Choose from below ");
        System.out.println("1-SPICY 2-SWEET 3-SALTY 4-SPICY_SALTY");
        System.out.print("Enter your choice : ");
        int taste = sc.nextInt();
        switch (taste) {
            case 1:
                foodItems.taste = FoodItems.Taste.SPICY;
                break;
            case 2:
                foodItems.taste = FoodItems.Taste.SWEET;
                break;
            case 3:
                foodItems.taste = FoodItems.Taste.SALTY;
                break;
            case 4:
                foodItems.taste = FoodItems.Taste.SPICY_SALTY;
            default:
                System.out.println("Enter right taste.");
        }
    }
}

