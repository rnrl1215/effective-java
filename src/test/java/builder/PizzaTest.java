package builder;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static builder.NyPizza.Size.SMALL;

class PizzaTest {

    @Test
    void pizzaTest() {
        NyPizza nyPizza = new NyPizza.Builder(SMALL).addToping(Pizza.Topping.HAM).build();

        Calzone calzone = new Calzone.Builder().sauceInSide().addToping(Pizza.Topping.ONION).build();

        Assertions.assertThat(nyPizza.getSize()).isEqualTo(SMALL);
        Assertions.assertThat(calzone.isSauceInside()).isEqualTo(true);

    }
}