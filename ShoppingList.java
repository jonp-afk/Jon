/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppinglist;
import java.util.*;
import java.text.NumberFormat;

/**
 *
 * @author jprice2027
 */
public class ShoppingList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Create a Java project called ShoppingList

Use the Scanner to get a list of items from the user (Carrots, Bread, Corn etc), with a price for each item. Recall how to build Classes / objects.

Store these items in an ArrayList (see my demo), and display them, numbered, with the cost total. Allow users to remove an item, numbered.

Redisplay the new list.*/
        
        //Declaring variables
        Scanner scan = new Scanner(System.in);
        String userItem = "";
        double userPrice = 0.00;
        int userQuant = 0;
        int j = 0; //this will be incremented later to print the arraylist
        ArrayList shop = new ArrayList(); //creating arrayList
        String userInput = "";
        int itemRemover; //number of item user chooses to remove
        
        while(!userInput.equals("done")){ //While loop for the shop, ends with input of "done"
            //prompting user inputs for item name, price, quantity and storing in respective variables
            System.out.println("Enter an item: ");
            userItem = scan.nextLine();
            System.out.println("Enter its price: ");
            userPrice = scan.nextDouble();
            System.out.println("Enter its quantity: ");
            userQuant = scan.nextInt();
            
            //creating new item object with those variables
            Item purchase = new Item(userItem, userPrice, userQuant);
            shop.add(purchase); //adds item object to the array list
            System.out.println("\nShopping list:");

            while (j < shop.size()){ //This allows for each item in the array list to be printed individually and numbered
                System.out.println((j+1) + ". " + shop.get(j)); //adding one to compensate for 0 based arraylst indexes
                j++;
            }
            j=0; //resetting j to 0 so it can print the whole list properly again when this loop is used later
            
        while(!userInput.equals("add") && !userInput.equals("done")){ //this loop lets the user repeatedly remove items until they finish or add another
            System.out.println("Type \"add\" to add an item, type \"remove\" to delete an item, type \"done\" to finish.");
            scan.nextLine();
            userInput = scan.nextLine();        
            
            
            if (userInput.equals("remove")){
                System.out.println("What item number would you like to remove?");
                itemRemover = scan.nextInt();
                shop.remove(itemRemover -1); //we subtract 1 to account for 0 based indexes
                System.out.println("New list:");
                while (j < shop.size()){ //same loop as earlier to reprint the edited list
                    System.out.println((j+1) + ". " + shop.get(j));
                    j++;
            }
                
            }
        
        }
        
        if (userInput.equals("add") || userInput.equals("remove")){
            userInput = ""; //resetting userInput so it doesn't skip this loop the second time around
        }
        j=0; //resetting j to 0 to print the list properly when the code loops
        }
        
    }
    
}

class Item{
    //private class variables for encapsulation
    private String itemName;
    private double itemPrice;
    private int itemQuant;
    
    public Item(String inName, double inPrice, int inQuant){ //constructor to define what makes up an item object
        itemName = inName;
        itemPrice = inPrice;
        itemQuant = inQuant;
    }
    
    public String toString(){ //toString to formathow items will be printed in the arraylist
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance(); //formatting for US dollars
        String itemString = "Item: ";
        String priceString = "Price: ";
        String quantString = "Quantity: ";
        return itemString + itemName + ", " + priceString + fmt1.format(itemPrice) + ", " + quantString + itemQuant + "\n";
    }
}

