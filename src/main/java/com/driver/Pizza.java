package com.driver;

public class Pizza {

    private int price;
    private String bill;
    private int cheesePrice;
    private int toppingPrice;
    private int paperBegPrice;
    private int totalPrice;
    boolean extraCheese, extraTopping, paperBeg,billGen;
    public Pizza(Boolean isVeg){//here in contructor we will iniialize
        if(isVeg){
            price=300;
            toppingPrice = 70;
        }else{
            price=400;
            toppingPrice = 120;
        }
        bill = "Base Price Of The Pizza: "+price+"\n";
        totalPrice = price;
        cheesePrice = 80;
        paperBegPrice = 20;
        extraCheese = false;
        extraTopping = false;
        paperBeg = false;
        billGen = false;
    }

    public int getPrice(){

        return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese){
            totalPrice += cheesePrice;
            extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraTopping){
            totalPrice += toppingPrice;
            extraTopping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperBeg){
            totalPrice+=paperBegPrice;
            paperBeg = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!billGen){
            if(extraCheese){
                bill += "Extra Cheese Added: "+cheesePrice+"\n";
            }
            if(extraTopping){
                bill += "Extra Toppings Added: "+toppingPrice+"\n";
            }
            if(paperBeg){
                bill += "Paperbag Added: "+paperBegPrice+"\n";
            }
            bill += "Total Price: " + totalPrice;
            billGen = true;
        }
        return bill;
    }
}
