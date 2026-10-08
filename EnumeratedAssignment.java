/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumeratedassignment;
import java.util.Scanner;

/**
 *
 * @author jprice2027
 */
public class EnumeratedAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          /*1a)  Write a main method that creates an enumeration of the days in the week. 
    Once the enum has been created and the day in the week variables filled, print them all out, 
    but rather than the zero based ordinals, print out the days in the week (1-7).*/
    
    //creating enumeration and assigning variables
    enum Days {monday, tuesday, wednesday, thursday, friday, saturday, sunday};
    Days day1 = Days.monday;
    Days day2 = Days.tuesday;
    Days day3 = Days.wednesday;
    Days day4 = Days.thursday;
    Days day5 = Days.friday;
    Days day6 = Days.saturday;
    Days day7 = Days.sunday;
    
    //adding one to the ordinal value to make it correspond to the day's number
    System.out.println("First day is " + day1 + ". This is day " + (day1.ordinal() + 1));
    System.out.println("Second day is " + day2 + ". This is day " + (day2.ordinal() + 1));
    System.out.println("Third day is " + day3 + ". This is day " + (day3.ordinal() + 1));
    System.out.println("Fourth day is " + day4 + ". This is day " + (day4.ordinal() + 1));
    System.out.println("Fifth day is " + day5 + ". This is day " + (day5.ordinal() + 1));
    System.out.println("Sixth day is " + day6 + ". This is day " + (day6.ordinal() + 1));
    System.out.println("Seventh day is " + day7 + ". This is day " + (day7.ordinal() + 1));
            
            
    /*1b) Write a main method that creates an enumeration of the months in the year. 
    Once the enum has been created and the month variables filled, print them out, but not with the enum ordinals, 
    but the "month in the year" numbers (1-12).*/
    
    //making month enumeration and defining variables
    enum Months {january, february, march, april, may, june, july, august, september, october, november, december};
    Months month1 = Months.january;
    Months month2 = Months.february;
    Months month3 = Months.march;
    Months month4 = Months.april;
    Months month5 = Months.may;
    Months month6 = Months.june;
    Months month7 = Months.july;
    Months month8 = Months.august;
    Months month9 = Months.september;
    Months month10 = Months.october;
    Months month11 = Months.november;
    Months month12 = Months.december;
    
    //adding one to the ordinal value to make it correspond to the month's number
    System.out.println("\nThe first month is " + month1 + ". This is month " + (month1.ordinal() + 1));
    System.out.println("The second month is " + month2 + ". This is month " + (month2.ordinal() + 1));
    System.out.println("The third month is " + month3 + ". This is month " + (month3.ordinal() + 1));
    System.out.println("The fourth month is " + month4 + ". This is month " + (month4.ordinal() + 1));
    System.out.println("The fifth month is " + month5 + ". This is month " + (month5.ordinal() + 1));
    System.out.println("The sixth month is " + month6 + ". This is month " + (month6.ordinal() + 1));
    System.out.println("The seventh month is " + month7 + ". This is month " + (month7.ordinal() + 1));
    System.out.println("The eighth month is " + month8 + ". This is month " + (month8.ordinal() + 1));
    System.out.println("The ninth month is " + month9 + ". This is month " + (month9.ordinal() + 1));
    System.out.println("The tenth month is " + month10 + ". This is month " + (month10.ordinal() + 1));
    System.out.println("The eleventh month is " + month11 + ". This is month " + (month11.ordinal() + 1));
    System.out.println("The twelfth month is " + month12 + ". This is month " + (month12.ordinal() + 1));

    /*2) Write a main method which asks for your CCHS username (including graduation year).It must create a string of the username, 
    as well as a string of the year part (use substring method of String object). Recall all the years have a length of 4 characters.
    Use an Integer object to parse the int value of that string. Have the method print your graduation year, as well as say what the year 
    after your graduation year will be by adding 1 to the parsed int value.
    Have it also print "In computer language, you graduate in: " and then the binary string version of your graduation year.*/
    
    //prompting for user input
    Scanner scan = new Scanner(System.in);
    System.out.println("enter your CCHS username:");
    
    //separating CCHS username into different strings
    String username = new String(scan.nextLine());
    String name = username.substring(0, username.length() - 4);
    String year = username.substring(username.length() - 4);
    
    int gradYear = Integer.parseInt(year); //parsing the graduation year string into an integer
    String binaryYear = Integer.toBinaryString(gradYear); //turning graduation year into a binary value
    
    System.out.println("Name: " + name);
    System.out.println("Graduation year: " + year);
    System.out.println("Year after: " + (gradYear + 1)); //now that graduation year is an integer 1 can be added to print future year
    System.out.println("In computer language, you graduate in: " + binaryYear);
    }
}
