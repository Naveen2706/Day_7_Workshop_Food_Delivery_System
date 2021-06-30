public class Main {
    public static void main(String[] args) {
        Salad salad = new Salad();
        salad.price = 40;
        HakkaNoodles hakkaNoodles = new HakkaNoodles();
        hakkaNoodles.price = 60;
        Momos momos = new Momos();
        momos.price = 80;
        Tandoor tandoor = new Tandoor();
        tandoor.price = 110;
        VegThali vegThali = new VegThali();
        vegThali.price = 120;

        FoodManager foodmanager = new FoodManager();
        foodmanager.add(tandoor);
        foodmanager.add(vegThali);
        foodmanager.add(momos);
        foodmanager.add(salad);
        foodmanager.add(hakkaNoodles);

        foodmanager.print();
    }
}
