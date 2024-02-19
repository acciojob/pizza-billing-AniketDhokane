package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public int baseVegPrice=0;
    public int baseNonpPrice=0;
    public int extraCheese=0;
    public int vegToppingPrice=0;
    public int nonToppingPrice=0;

    public  int paperBagPrice=0;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
        this.baseVegPrice=300;
        this.vegToppingPrice=70;
        price+=baseVegPrice;
        }else {
        this.baseNonpPrice=400;
        this.nonToppingPrice=120;
        price+=baseNonpPrice;
        }
        this.extraCheese=80;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        price+=extraCheese;

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            price+=vegToppingPrice;
        }
        else {
            price+=nonToppingPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        paperBagPrice=20;
        price+=paperBagPrice;

    }

    public String getBill(){
        // your code goes here
        if(isVeg) {
            bill = "Base Price Of The Pizza: " + baseVegPrice+"\n"+"Extra Cheese Added:"+extraCheese+"\n"+"Extra Toppings Added:"+vegToppingPrice+"\n"+"Paperbag Added:"+ paperBagPrice+"\n"+"Total Price:"+price;
        }
        else {
            bill = "Base Price Of The Pizza: " + baseNonpPrice+"\n"+"Extra Cheese Added:"+extraCheese+"\n"+"Extra Toppings Added:"+nonToppingPrice+"\n"+"Paperbag Added:"+ paperBagPrice+"\n"+"Total Price:"+price;

        }
        return this.bill;
    }
}
