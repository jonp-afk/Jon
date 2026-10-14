/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anatomyofaclass;

/**
 *
 * @author jprice2027
 */
public class AnatomyofaClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*1) What is the difference between a class and an object?
    
    A class is an object's blueprint and represents it with variables
    (state) and methods (behavior). An object is defined by the class and has state and behavior.

    2) What happens when you pass an object to a print or println method?
    
    The toString method is called which returns a string of the object's most important variables. 

    3) What is the scope of a variable in a method? In a class?
        
    It can only be referenced within that method -- it is local data. In a class, the variable can be referenced
    anywhere within that class.

    4) Carry out the following programming project.

    Write a class called Car that has 1 string variable called carBrand
    An int variable called enginePower (in Horse Power)
    A double variable called maxSpeed (in MPH)
    A double variable called price (in $)

    I suggest you start a control main method in the Main class, 
    and use this to construct a single car object from the 
    Car class as you go along, to help debug.

    Write a constructor to produce a base car.

    Write methods to set and get the brand, enginePower, as well as carSpeed and price

    Write a toString method to print out these details.

    Write a driver method in main to create car types VW Bug, 
    Toyota Prius, BMW i8, Tesla Model 3, 
    give them the enginePower and maxSpeed as you wish, 
    and print these details out.*/
    
    //defining stats of the four cars
    Car car1 = new Car("VW Bug", 50, 72, 2090);
    Car car2 = new Car("Toyota Prius", 196, 112, 28755);
    Car car3 = new Car("BMW i8", 360, 155, 147500);
    Car car4 = new Car("Tesla Model 3", 510, 163, 38630);
   
    //print statements will trigger the toString method
    System.out.println(car1);
    System.out.println("\n" + car2);
    System.out.println("\n" + car3);
    System.out.println("\n" + car4);
    }
    
}

//setting up car class and initializing variables for brand, HP, speed, price
class Car{
    private String carBrand = "";
    int enginePower;
    double maxSpeed;
    double price;
    
    //Car constructor defining the car object
    Car(String brand, int inPower, double inSpeed, double inPrice){
    carBrand = brand;
    enginePower = inPower;
    maxSpeed = inSpeed;
    price = inPrice;
    }
    
    //toString method to print out each variable of the car when called by the above print statements
    public String toString(){
    String brandString = "The Car Brand Is: " + carBrand;
    String engineString = "Horse power is: " + enginePower + " HP";
    String maxString = "Max speed is: " + maxSpeed + " MPH";
    String priceString = "Price is: $" + price;
    return brandString + "\n" + engineString + "\n" + maxString + "\n" + priceString;
    }
}
