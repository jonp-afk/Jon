/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberformatassignment;

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Random;
import java.math.BigInteger;


/**
 *
 * @author jprice2027
 */
public class NumberFormatAssignment {

    public static void main(String[] args) {
        
         /*1. Ask for total number of students at a school (any school). Now ask for the number of girls at that school. 
    Using Number formatting, output the % of girls and % of boys at that school.*/
    
    Scanner scan = new Scanner(System.in);
    
    //prompting the user to input numbers
    System.out.println("Enter the number of students at your school:");
    double students = scan.nextInt();
    System.out.println("Enter the number of girls at your school:");
    double girls = scan.nextInt();
    
    //defining percent fractions
    double girlsPercent = girls/students;
    double boysPercent = (students - girls)/students;
    
    //using numberFormat to format above fractions as a percent
    NumberFormat fmt1 = NumberFormat.getPercentInstance();
    System.out.println("Your school is " + fmt1.format(girlsPercent) + " girls and " + fmt1.format(boysPercent) + " boys.");
    

    /*2.Ask for total amout of money in Dollars and Cents. The method must convert this value to British Pounds 
    (gbp - Exchange rate on 9/26 is 0.75 pence to 1$). Output the number of Pounds, mentioning the exchange rate, 
    in a British (locale) number format. Do the same for the Euro (86 eCents to 1$ today)*/
    
    System.out.println("Enter your total amount of money in Dollars and Cents:");
    double usDollars = scan.nextDouble();
    
    //setting up UK tax rate, defining pounds symbol
    final double UK_RATE = 0.75;
    Locale ukLocale = Locale.UK;
    double ukPounds = UK_RATE * usDollars;
    
    //using number format to format the amount in the style of UK pounds
    NumberFormat fmt2 = NumberFormat.getCurrencyInstance(ukLocale);
    System.out.println("Converted to British Pounds: " + fmt2.format(ukPounds) + " with an exchange rate of " + UK_RATE);
    
    //same process with euros
    final double EURO_RATE = 0.86;
    Locale frLocale = Locale.FRANCE;
    double eCents = EURO_RATE * usDollars;
    NumberFormat fmt3 = NumberFormat.getCurrencyInstance(frLocale);
    System.out.println("Converted to Euros: " + fmt3.format(eCents) + " with an exchange rate of " + EURO_RATE);
   

    /*3. Ask for an integer from 0 to 15, and based on the input, format the number Pi (from the Math class) 
    to that number of decimal places, and print it out appropriately.*/
    
    System.out.println("Enter an integer from 0 to 15:");
    int userInput = scan.nextInt();
    
    //rounding pi by scaling with 10 to the power of whatever the user entered
    double scale = Math.pow(10, userInput);
    final double PI = Math.PI;
    double roundedPi = Math.round(PI * scale) / scale;
    System.out.println("Pi rounded to " + userInput + " decimal places: " + roundedPi);
    

    /*4. Generate a random number from 100,000,000 to 999e18as a decimal number (no scientific notation).*/
    
    Random rand = new Random();
    
    //using BigInteger to properly express the large number, setting up min and max
    BigInteger min = new BigInteger("100000000");
    BigInteger max = new BigInteger("999000000000000000000");
    
    //defining the range that the random number will be in using long
    long rangeLength = max.subtract(min).longValue() + 1;
    
    //generating a big integer with a value within the range
    BigInteger randomNum = min.add(new BigInteger(String.valueOf(rand.nextLong(0, rangeLength))));
    System.out.println(randomNum);
    
    }
}
