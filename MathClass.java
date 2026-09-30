/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.mathclass;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jprice2027
 */
public class MathClass {

public static double roundAvoid(double value, int places){
    double scale = Math.pow(10, places);
    return Math.round(value * scale) / scale;
}
    public static void main(String[] args) {
        
    /*1. Write a program that generates a random number in the range 0 to 90 inclusive. 
Using the Math class, display the sine, cosine and tangent for that number, rounded to 3 decimal places,  in the format: 
"Number: 45 Sine: 0.851 Cosine: 0.525 Tangent: 1.620"*/


    Random rand = new Random();
    int randomNumber1 = rand.nextInt(91);
    double sine = Math.sin(randomNumber1);
    double cosine = Math.cos(randomNumber1);
    double tangent = Math.tan(randomNumber1);;
    System.out.println("Number: " + randomNumber1 + " Sine: " + roundAvoid(sine, 3) + " Cosine: " + roundAvoid(cosine, 3) + " Tangent: " + roundAvoid(tangent, 3));


/*2. Generate another random real number, value 1.0 to20.0, to generate the radius of a circle. Use  the MathClass to 
calculate the  area of that circle, as well as the volume of a sphere of that radius, all rounded to 3 decimal places.*/

    double randomRadius = rand.nextDouble(19.0) + 1;
    double circleArea = Math.pow(randomRadius, 2) * Math.PI;
    double sphereVolume = Math.pow(randomRadius, 3) * Math.PI * (4.0/3);
    System.out.println("Radius: " + roundAvoid(randomRadius, 3) + " Circle Area: " + roundAvoid(circleArea, 3) + " Sphere Volume: " + roundAvoid(sphereVolume, 3));
    
/*3. Generate a random real number in the range 100,000,000.0 to 100,000,000,000.0, and using the Math Class, display that number, 
it's square root, as well as it'snatural logarithm and it's Log10 values, all rounded to 5 decimal places.*/

    double randomNumber2 = 100000000.0
            + rand.nextDouble() * (100000000000.0 - 100000000.0);
    double squareRoot = Math.sqrt(randomNumber2);
    double ln = Math.log(randomNumber2);
    double log = Math.log10(randomNumber2);
    System.out.println("Number: " + roundAvoid(randomNumber2, 5) + " Square root: " + roundAvoid(squareRoot, 5) + " Natural Logarithm: " + roundAvoid(ln, 5) + " Log10: " + roundAvoid(log, 5));
    
/*4. Using the high real number value just generated, calculate the Mass required (in Grams) to generate that much energy in joules. 
(E = mc ^2). Hint, if speed of light (c) is in m/s, the mass will be in grams - so assume your large number is in joules (j). 
Look up the value of c in m/s. Use the "roundAvoid" method to output this number to a user defined number of decimal places.*/

    final double SPEED_OF_LIGHT = 299792458.0;
    double massKilograms = randomNumber2 / Math.pow(SPEED_OF_LIGHT, 2);
    double finalMass = massKilograms * 1000.0;
    System.out.println("Mass: " + roundAvoid(finalMass, 7));
    
/*5. Use a scanner to get a real number value and an integer input by the user. Output the value to the power of the integer, using the 
Math Class methods, again rounded to a user input number of decimal places.*/

    Scanner scan = new Scanner(System.in);
    System.out.println("Type a real number value: ");
    double userValue = scan.nextDouble();
    System.out.println("Type an integer value: ");
    int userInteger = scan.nextInt();
    double result = Math.pow(userValue, userInteger);
    System.out.println("Your result is: " + roundAvoid(result, 2));
    }
}