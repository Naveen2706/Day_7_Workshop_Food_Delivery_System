import java.util.ArrayList;
import java.util.List;

public class FoodItems {
    enum Taste {SPICY, SWEET, SALTY, SPICY_SALTY };
    enum Category {MAINCOURSE, STARTERS, JUICES, DESSERT};
    enum Type{VEG, NON_VEG};

    @Override
    public String toString() {
        return "FoodItems{" +
                ", name=" + name +
                ", type=" + type +
                ", category=" + category +
                ", taste=" + taste +
                ", price=" + price +
                '}';
    }

    String name;
    Type type;
    Category category;
    Taste taste;
    byte price;
}
