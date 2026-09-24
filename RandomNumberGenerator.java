/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumbergenerator;

//importing necessary classes
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author jprice2027
 */
public class RandomNumberGenerator {

    
    public static void main(String[] args) {
        //declaring scanner and random number generator
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
       
        //variable declaration for phone number
        int num1;
        int num2;
        int num3;
        int secondsect;
        int thirdsect;
        System.out.print("Press \"p\" to generate a random phone number.");
        System.out.print(" Press \"r\" to roll the dice. \nPress -1 to end the game.");
        String dialogue = scan.next(); //waiting for user input
        
        
    while (!dialogue.equals("-1")){//loop ends when -1 is entered
        while(dialogue.equals("p")){ //number will only generate when user enters p
        
        //using random number generator to define variables
        num1 = rand.nextInt(8);
        num2 = rand.nextInt(8);
        num3 = rand.nextInt(8);
        secondsect = rand.nextInt(656);
        thirdsect = rand.nextInt(10000);
        String secondsectzeros = String.format("%03d", secondsect); //keeping leading zeros intact
        String thirdsectzeros = String.format("%04d", thirdsect);
        System.out.println("" + num1 + num2 + num3 + "-" + secondsectzeros + "-" + thirdsectzeros);
        System.out.println("Press \"p\" to generate a random phone number, or \"r\" to roll the dice.");
        dialogue = scan.next(); //requires user input before continuing the loop
        }
         
       
        
        while(dialogue.equals("r")){//dice roll will only happen when user enters r
            int result = rand.nextInt(6) + 1; //result will be a number between 1 and 6
            System.out.println("You rolled a " + result + ".");
            System.out.println("Press \"p\" to generate a random phone number, or \"r\" to roll the dice.");
            dialogue = scan.next(); //requires user input before continuing
        }
    }
}
}