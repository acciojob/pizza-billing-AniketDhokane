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
   public boolean paperBagFlag=true;

   public  boolean billFlag=true;

   public boolean t1=true;
   public boolean c1=true;

   public boolean b1=true;




    public  int paperBagPrice=0;
    public Pizza(Boolean isVeg){

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

        if(paperBagFlag){
            this.paperBagPrice = 20;
            price += this.paperBagPrice;
            paperBagFlag=false;
        }

    }

    public String getBill(){
        // your code goes here
        if(c1) {
            bill += "Extra Cheese Added: " + extraCheese + "\n";
            c1=false;

        }
        if (t1) {
            bill += "Extra Toppings Added: " + ToppingPrice + "\n";
            t1=false;
        }
        if(paperBagPrice!=0) {
            bill += "Paperbag Added: " + paperBagPrice + "\n";

        }

        if(b1) {
            bill += "Total Price: " + price + "\n";
            b1=false;
        }

        return bill;
    }
}
