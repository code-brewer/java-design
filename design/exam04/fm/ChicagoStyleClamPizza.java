package design.exam04.fm;

/**
 * 披萨具体类
 * Created by MelloChan on 2017/10/24.
 */
public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
