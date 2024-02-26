package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        this.extraCheese=80;
        if(isVeg)
        this.ToppingPrice=70;

        else this.ToppingPrice=120;

    addExtraCheese();
    addExtraToppings();
    }
}
