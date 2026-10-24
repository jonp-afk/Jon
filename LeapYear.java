/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leapyear;
import java.util.Scanner;

/**
 *
 * @author jprice2027
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
/*Write a program that reads an integer value from the user rep-
resenting a year. The purpose of the program is to determine if
the year is a leap year (and therefore has 29 days in February)
in the Gregorian calendar. Use a boolean variable isLeapYear for 
this (initialize to false).  

A year is a leap year if it is divisable by 4, unless it is also 
divisable by 100 but not 400. For example, the year 2003 is not a leap year, 
but 2004 is. The year 1900 is not a leap year because it is divisable by 
100 but not 400, and the year 2000 is a leap year because it is divisable by
100, and also divisable by 400 (recall integer division and remainders). Produce 
an error message for
any input value less than 1582 (the year the Gregorian calendar
was adopted).*/

    //defining scanner and setting up user input
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a gregorian calendar year:");
    int userYear = scan.nextInt();
    
    //initializing boolean variable
    boolean isLeapYear = false;
    
    //if the year is before 1582 the program will give the error message and not check anything else
     if (userYear < 1582){
        System.out.println("Error. Year provided is before the gregorian calendar was adopted.");
    }
     //moving forward, the two coniditions for not being a leap year are checked via remainder(%)
     else{
        //the logic gate or is used to combine the two conditions into one statement
        if ((userYear%4 != 0) || (userYear%100 == 0 && userYear%400 !=0) ){
        isLeapYear = false; //boolean variable is now false under this condition
        System.out.println("This is not a leap year.");
     }   
        //finally if it doesn't meet the failure conditions and the year is divisible by 4 it is a leap year
        else if (userYear%4 == 0){
            isLeapYear = true; //accordingly, boolean variable is set to true
            System.out.println("This is a leap year.");
        }
    }

    }
    
}



