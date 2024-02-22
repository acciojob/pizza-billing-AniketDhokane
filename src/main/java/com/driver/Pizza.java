package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";

    public int baseVegPrice=0;
    public int baseNonpPrice=0;
    public int extraCheese=0;
    public int ToppingPrice=0;

    public boolean toppingFlag=true;
    public boolean cheeseFlag=true;
   public boolean flag=true;




    public  int paperBagPrice=0;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
        this.baseVegPrice=300;
        this.ToppingPrice=70;
        price=price+baseVegPrice;
            bill+="Base Price Of The Pizza: "+baseVegPrice+"\n";
        }else {
        this.baseNonpPrice=400;
        this.ToppingPrice=120;
        price+=baseNonpPrice;
            bill+="Base Price Of The Pizza: "+baseNonpPrice+"\n";
        }
        this.extraCheese=80;


    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseFlag) {
            price += this.extraCheese;
            cheeseFlag=false;
        }





    }

    public void addExtraToppings(){
        // your code goes here
        if(toppingFlag) {
            price += this.ToppingPrice;
            toppingFlag=false;
        }




    }

    public void addTakeaway(){
        // your code goes here

        if(flag){
            this.paperBagPrice = 20;
        price += this.paperBagPrice;
            flag=false;
        }

    }

    public String getBill(){
        // your code goes here
        if(!cheeseFlag)
        bill+="Extra Cheese Added: "+extraCheese+"\n";

        if (!toppingFlag)
        bill+="Extra Toppings Added: "+ToppingPrice+"\n";

        if(!flag) {
            bill += "Paperbag Added: " + paperBagPrice + "\n";
        }

        bill+="Total Price: "+price+"\n";

        return this.bill;
    }
}
