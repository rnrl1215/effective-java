package builder;

import static builder.NyPizza.Size.SMALL;
import static builder.Pizza.Topping.*;

public class PizzaTest {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(SMALL).addToping(SAUSAGE).addToping(ONION).build();

        Calzone calzone = new Calzone.Builder().addToping(HAM).sauceInSide().build();
    }
}