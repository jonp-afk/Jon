/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mystore;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author jprice2027
 */
public class MyStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
/*Write a program (project) called "MyStore"

After the public Class MyStore, add another class called "Item"

Give the Item Class variables strName and dblPrice.

Items: T Shirt - 29.99, Shoes - 125.99, Jeans - 60.99, Jacket - 250.00, Hat - 25.99, Shorts - 75.99, Blouse - 88.99

Create a toString method that return the name and price (e.g. "Item: Shoes, Price: 125.99")

Add getters and setters to set/return both variables

in the MyStore controlling main method, set a colnstant variable MAX_BUDGET to $250.00

Ask the user to enter items. If they enter "T Shirt" or whatever, get the price for that item. Add each item's price to a total, 
and increment a count.

After each entry, let them know the count and how much they've spent so far. Set conditional statements so that they cannot go over budget 
(give a warning if they go over budget).

You can use a while(true) loop for this.*/

        //setting up variables for the user's total and item count, as well as max budget
        final double MAX_BUDGET = 250.00;
        double userTotal = 0.0;
        int userCount = 0;
        
        //Defining scanner, printing initial dialogue
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the store!");
        System.out.println("Items available for purchase are T Shirt - 29.99, Shoes - 125.99,"
         + "Jeans - 60.99, Jacket - 250.00, Hat - 25.99, Shorts - 75.99, Blouse - 88.99");
        System.out.println("Your budget is $250.00. Enter the items you would like to purchase:");
        String userItem = scan.nextLine();
        
        Item purchase = new Item("", 0.00); //setting up instance of the item class 
        
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance(); //For later formatting to US dollars
        
        while(true){ 
            //set of if statements for if a user enters one of the items.
            //Nanme and price variables are set, and then purchase is printed via toString
        if (userItem.equals("T Shirt")){
            purchase.setStrName("T Shirt");
            purchase.setDblPrice(29.99);
            System.out.println(purchase);    
        }
        
        //repeat for each item
        else if (userItem.equals("Shoes")){
            purchase.setStrName("Shoes");
            purchase.setDblPrice(125.99);
            System.out.println(purchase);
        }
        
        else if (userItem.equals("Jeans")){
            purchase.setStrName("Jeans");
            purchase.setDblPrice(60.99);
            System.out.println(purchase);   
        }
        
        else if (userItem.equals("Jacket")){
            purchase.setStrName("Jacket");
            purchase.setDblPrice(250.00);
            System.out.println(purchase); 
        }
        
        else if (userItem.equals("Hat")){
            purchase.setStrName("Hat");
            purchase.setDblPrice(25.99);
            System.out.println(purchase);   
        }
        
        else if (userItem.equals("Shorts")){
            purchase.setStrName("Shorts");
            purchase.setDblPrice(75.99);
            System.out.println(purchase);           
        }
        
        else if (userItem.equals("Blouse")){
            purchase.setStrName("Blouse");
            purchase.setDblPrice(88.99);
            System.out.println(purchase);   
        }
        
        //if the current total plus the purchase price goes over budget, the total will not be updated and the user is warned
        //also need to check that the user entered a valid item to trigger this statement
        if (userTotal + purchase.getDblPrice() > MAX_BUDGET && ((userItem.equals("T Shirt")) || (userItem.equals("Shoes")) 
        || (userItem.equals("Jeans")) || (userItem.equals("Jacket")) || (userItem.equals("Hat")) || (userItem.equals("Shorts")) ||
        (userItem.equals("Blouse")))) {
            System.out.println("Warning: This item exceeds your budget! It has not been added to your purchase count.");  
        }
        
        //If the item is wtihin budget, the total increments by the item's price and the item count increments by 1
        //again, we check that the user entered a valid item
        else if ((userItem.equals("T Shirt")) || (userItem.equals("Shoes")) || (userItem.equals("Jeans")) ||
        (userItem.equals("Jacket")) || (userItem.equals("Hat")) || (userItem.equals("Shorts")) ||
        (userItem.equals("Blouse"))){ 
            userTotal+= purchase.getDblPrice();
            userCount+=1;
            System.out.println("Item count: " + userCount + "\nTotal spent: " + fmt1.format(userTotal));   
        }
        //after each item is entered regardless of what it is the scanner will allow the user to type a new item
        userItem = scan.nextLine();
        }
        
    } 
}

class Item{
    //private instance variables for item name and price
    private String strName;
    private double dblPrice;
    
    //Class constructor
    public Item(String inName, double inPrice){
        strName = inName;
        dblPrice = inPrice;
    }
    
    //Prints out the item and its price when called on
    public String toString(){
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance(); //formatting for US dollars
        String itemString = "Item: " + strName;
        String priceString = "Price: " + fmt1.format(dblPrice);
        
        return itemString + ", " + priceString;
    }
    
    //getters and setters for each variable
    public String getStrName(){
        return strName;
    }
    
    public void setStrName(String newName){
        strName = newName;
    }
    
    public double getDblPrice(){
        return dblPrice;
    }
    
    public void setDblPrice(double newPrice){
        dblPrice = newPrice;
    }
}