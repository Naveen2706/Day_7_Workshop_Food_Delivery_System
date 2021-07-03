import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

interface IVeg {
}

interface INonVeg {
}

    public abstract class FoodItems {
    enum Taste {SPICY, SWEET, SALTY, SPICY_SALTY};

    enum Category {MAINCOURSE, STARTERS, JUICES, DESSERT};
    // enum Type{VEG, NON_VEG};

    @Override
    public String toString() {
        return "FoodItems{" +
                ", name=" + name +
                //", type=" + type +
                ", category=" + category +
                ", taste=" + taste +
                ", preparationTime=" + preparationTime +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodItems foodItem = (FoodItems) o;
        return Float.compare(foodItem.price, price) == 0 && preparationTime == foodItem.preparationTime && taste == foodItem.taste && category == foodItem.category && Objects.equals(name, foodItem.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(taste, price, preparationTime, category, name);
    }


    String name;
    //  Type type;
    Category category;
    Taste taste;
    byte price;
    byte preparationTime;

    public abstract void mainIngredient();
}
