/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulationassigment;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author jprice2027
 */
public class EncapsulationAssigment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //defining scanner, prompting for user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a financial amount:");
        double userAmount = scan.nextDouble();
        System.out.println("Enter the number months for repayment:");
        int userMonths = scan.nextInt();
        
        //creating an instance of InterestRateCalculator class
        InterestRateCalculator rate = new InterestRateCalculator(userAmount, userMonths);
        System.out.println(rate); //calls on toString method
    }
    
    
}

class InterestRateCalculator{
    
    //initializing private variables in new class, setting up interest rate constant
    public static final double RATE = 0.15;
    private double userAmount;
    private int userMonths;
    private double monthlyPayment;
    
    //constructor defining needed arguments
    public InterestRateCalculator(double inAmount, int inMonths){
        userAmount = inAmount;
        userMonths = inMonths;
        monthlyPayment = calculate(userAmount, userMonths);
    }

    //public method to calculate the monthly payment amount
    public double calculate(double userAmount, int userMonths){
        double amountPerMonth = userAmount/userMonths;
        double monthlyPayment = amountPerMonth + RATE * amountPerMonth;
        return monthlyPayment; 
    }

    //public method to calculate the total repayment
    public double calculateTotal(double monthlyPayment){
        double totalPayment = monthlyPayment * userMonths;
        return totalPayment;
    }
    
    //toString method that prints the monthly and total payment formatted as US dollars, as well as the rate constant as a percentage
    public String toString(){
        NumberFormat fmt1 = NumberFormat.getPercentInstance();
        NumberFormat fmt2 = NumberFormat.getCurrencyInstance();
        String month = "Your monthly payment with a rate of " + fmt1.format(InterestRateCalculator.RATE) + " is " + fmt2.format(monthlyPayment);
        String total = "Your total repayment amount is " + fmt2.format(calculateTotal(monthlyPayment));
        return month + "\n" + total;
    }

}
